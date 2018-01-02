package zzzll.solar.util;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class MyFrame extends Frame{

	public void launchFrame() {
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGTH);
		setLocation(100,100);
		setVisible(true);//Ĭ������²��ɼ�
		
		//�������ǵ��ػ��߳�
		new PaintThread().start();
		
		
		//���������ڲ��࣬��������
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
	 * ����һ���ػ����ڵ��߳���,�ڲ���,��������ⲿ������Ժͷ�����repaint���ⲿ��ķ���
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
