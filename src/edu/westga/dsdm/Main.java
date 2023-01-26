package edu.westga.dsdm;

import edu.westga.dsdm.snowflake.Snowflake;

/**
 * The Class Main
 * 
 * The entry point into the snowflake application
 * 
 * @author CS3151
 * @version Spring 2023
 */
public class Main {
	/**
	 * Starts the snowflake application
	 * @param args not used
	 */
	public static void main(String[] args) {
		Snowflake world = new Snowflake();
		world.setVisible(true);
		world.run();
	}
}
