package zzzll.solar.util;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class MyFrame extends Frame{

	public void launchFrame() {
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGTH);
		setLocation(100,100);
		setVisible(true);//默认情况下不可见
		
		//启动我们的重画线程
		new PaintThread().start();
		
		
		//增加匿名内部类，监听窗口
		addWindowListener(new WindowListener() {
			
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		});
	}

	/**
	 * 定义一个重画窗口的线程类,内部类,方便访问外部类的属性和方法。repaint是外部类的方法
	 * @param args
	 */
	class PaintThread extends Thread {
		public void run() {
			while (true) {
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
