package org.browserbot;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.browserbot.ui.BrowserWindow;
import org.browserbot.util.FileManager;

/**
 * Java Browser Automation Software.
 * 
 * @version 0.5
 *
 * @see <a href="http://www.browserbot.org">BrowserBot</a>
 * 
 * @author Desmond Jackson
 */
public class BrowserBot extends Object {
	
	/**
	 * The application major version.
	 */
	public static final int MAJOR_VERSION = 0;

	/**
	 * The application minor version.
	 */
	public static final int MINOR_VERSION = 5;
	
	/**
	 * The main method.
	 * 
	 * @param args String arguments
	 */
	public static void main(String[] args) {
		FileManager.mkdirs();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new BrowserWindow().setVisible(true);
			}
			
		});
	}

}
