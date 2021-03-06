package com.icarus.tutorial.swt.helloswt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class HelloSWT {
	
	public static void main(String[] args) {
		// Tạo đối tượng Display
		Display display = new Display();
		
		// Tạo đối tượng Shell (Window)
		Shell shell = new Shell(display);
		
		shell.open();
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
	
}
