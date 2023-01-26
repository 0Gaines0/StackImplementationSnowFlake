package edu.westga.dsdm.snowflake;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * CloseQuit - exit application when window is closed
 *
 * @author Timothy Budd
 * @version CS3151
 */
class CloseQuit extends WindowAdapter {
	@Override
    public void windowClosing(WindowEvent event) {
        System.exit(0);
    }
}
