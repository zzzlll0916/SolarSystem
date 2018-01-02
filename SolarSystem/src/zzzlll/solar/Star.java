package zzzlll.solar;

import java.awt.Graphics;
import java.awt.Image;

import zzzll.solar.util.GameUtil;

public class Star {

	Image img;
	double x,y;
	int width,height;
	
	public void draw(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
	}
	
	public Star() {
		
	}
	
    public Star(Image img) {
		this.img = img;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
		//System.out.println(width);
	}
	
	public Star(Image img,double x,double y) {
		this(img);
		this.x = x;
		this.y = y;	
	}
	
	public Star(String imgpath,double x,double y) {
		this(GameUtil.getImage(imgpath),x,y);//调用另一个构造方法，根据参数判断另一个构造方法是哪一个
	//System.out.println(width);
	}
}
