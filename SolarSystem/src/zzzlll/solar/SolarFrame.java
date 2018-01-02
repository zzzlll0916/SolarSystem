package zzzlll.solar;

import java.awt.Graphics;
import java.awt.Image;

import zzzll.solar.util.Constant;
import zzzll.solar.util.GameUtil;
import zzzll.solar.util.MyFrame;

/**
 * 太阳系的主窗口
 * @author zzzlll
 
 */
public class SolarFrame extends MyFrame{
	
//由离太阳从近到远的顺序：水星、金星、地球、火星、木星、土星、天王星、海王星
	
	Image bg = GameUtil.getImage("images/bg.jpg");
	Star sun = new Star("images/sun.jpg", Constant.GAME_WIDTH/2, Constant.GAME_HEIGTH/2);

	Planet mercury = new Planet(sun, "images/shui.jpg", 60, 40, 0.05);
	Planet venus = new Planet(sun, "images/jin.jpg", 100, 70, 0.07);
	Planet earth = new Planet(sun, "images/earth.jpg", 150, 100, 0.1);
	Planet moon = new Planet(earth, "images/moon.jpg", 30, 20, 0.5,true);
	Planet mars = new Planet(sun,"images/huo.jpg", 200, 130, 0.01);
	
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		mercury.draw(g);
		venus.draw(g);
		earth.draw(g);
		moon.draw(g);
		mars.draw(g);
		
	}
 
	public static void main(String[] args) {
		new SolarFrame().launchFrame();
		
	}
}
