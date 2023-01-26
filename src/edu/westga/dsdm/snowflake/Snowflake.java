package edu.westga.dsdm.snowflake;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

import edu.westga.dsdm.model.LinkedListQueue;
import edu.westga.dsdm.model.LinkedListStack;
import edu.westga.dsdm.model.IterableQueue;
import edu.westga.dsdm.model.IterableStack;

/**
 * Snowflake - display of fractal snowflake
 *
 * @author Timothy Budd
 * @version CS3151
 */
public class Snowflake extends Frame {
	private static final long serialVersionUID = 1L;
	private IterableStack<Line> lines = new LinkedListStack<Line>();
	private LinkedList<Line> done = new LinkedList<Line>();

	/**
	 * Instantiates a new snowflake
	 */
	public Snowflake() {
		setTitle("Fractal Snowflake");
		setSize(400, 400);
		addWindowListener(new CloseQuit());
	}

	/**
	 * Runs the snowflake visualization
	 */
	public void run() {
		// insert first lines into snowflake
		Point pointA = new Point(50, 140);
		Point pointB = new Point(350, 140);
		Point pointC = new Point(200, 360);

		this.lines.push(new Line(pointA, pointB));
		this.lines.push(new Line(pointB, pointC));
		this.lines.push(new Line(pointC, pointA));

		// now make the snowflake
		while (!this.lines.isEmpty()) {
			Line line = (Line) this.lines.pop();
			this.processLine(line);
			try {
				Thread.sleep(100);
			} catch (Exception exc) {
				System.err.println(exc.getMessage());
			}
			repaint();
		}
	}

	private void processLine(Line line) {
		// first compute line lengths
		int distanceX = (line.stop.x - line.start.x) / 3;
		int distanceY = (line.stop.y - line.start.y) / 3;
		if ((distanceX * distanceX + distanceY * distanceY) < 10) {
			// line is too small
			this.done.addFirst(line);
		} else {
			Point pointA = new Point(line.start.x + distanceX, line.start.y + distanceY);
			Point pointB = new Point(line.start.x + 3 * distanceX / 2 + distanceY, line.start.y + 3 * distanceY / 2 - distanceX);
			Point pointC = new Point(line.start.x + 2 * distanceX, line.start.y + 2 * distanceY);
			this.lines.push(new Line(line.start, pointA));
			this.lines.push(new Line(pointA, pointB));
			this.lines.push(new Line(pointB, pointC));
			this.lines.push(new Line(pointC, line.stop));
		}
	}

	@Override
	public void paint(Graphics graphics) {
		for (Line line : this.lines) {
			line.draw(graphics);
		}
		for (Line line : this.done) {
			line.draw(graphics);
		}
	}
}
