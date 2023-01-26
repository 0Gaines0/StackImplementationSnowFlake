package edu.westga.dsdm.snowflake;

import java.awt.Graphics;
import java.awt.Point;

/**
 * Line
 *
 * @author Timothy Budd
 * @version CS3151
 */
public class Line {
	public Point start;
	public Point stop;
	
	/**
	 * Instantiates a new line 
	 * @param start the start point of the line
	 * @param stop the end point of the line
	 */
	public Line(Point start, Point stop) {
		this.start = start;
		this.stop = stop;
	}

	
	public Point getStart() {
		return start;
	}

	/**
	 * Draws the line
	 * @param graphics the graphics component
	 */
	public void draw(Graphics graphics) {
		graphics.drawLine(this.start.x, this.start.y, this.stop.x, this.stop.y);
	}
}
