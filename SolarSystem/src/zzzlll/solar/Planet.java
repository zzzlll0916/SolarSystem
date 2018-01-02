package zzzlll.solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import zzzll.solar.util.GameUtil;

public class Planet extends Star{

	//除了图片、坐标，行星沿着椭圆运行：长轴、短轴、速度、角度（速度的增量）、绕着某个star运行
	
	double longAxis;
	double shortAxis;
	double speed;
	double degree;
	Star center;
	boolean statellite;//默认为false
	
    public Planet(Star center,String imgpath,double longAxis,double shortAxis,
    		double speed,boolean statellite) {
		
		this(center, imgpath,longAxis,shortAxis,speed);//调用另一个构造器
		this.statellite = statellite;
	}
	
	public Planet(Star center,String imgpath,double longAxis,double shortAxis,double speed) {
		
		super( GameUtil.getImage(imgpath));//调用父类构造器，宽度和高度都有了，父类的值传进来。
		
		this.center = center;
		this.x = center.x + longAxis;
		this.y = center.y;
		
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed =speed;
	}
	
	public Planet(Image img, double x, double y) {
		super(img, x, y);
	}

	public Planet(String imgpath, double x, double y) {
		super(imgpath, x, y);
	}
	
	//重写父类draw方法，使得行星运行起来，轨道为椭圆
	public void draw(Graphics g) {
		//g.drawImage(img, (int)x, (int)y, null);
		super.draw(g);
		
		move();	
		if (!statellite) {
			drawtrace(g);
		}
	}
	
	
	public void drawtrace(Graphics g) {
		double ovalx,ovaly,ovalwidth,ovalheight;
		
		ovalx = (center.x + center.width/2) - longAxis;
		ovaly = (center.y + center.height/2) - shortAxis;
		
		ovalwidth = 2*longAxis;
		ovalheight = 2*shortAxis;
		
		Color c = g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int)ovalx, (int)ovaly, (int)ovalwidth, (int)ovalheight);
		
		g.setColor(c);
	}
	
	public void move() {
		
		/*
		 * 以原点为中心的椭圆方程表达式为：x = a*cos，y = b*sin
		 * 椭圆可以看作圆在某方向上的拉伸，它的参数方程是：x=acosθ ， y=bsinθ
		 */
		//沿着椭圆轨迹飞行
		x = center.x + width/2 + longAxis * Math.cos(degree);
		y = center.y + height/2 + shortAxis * Math.sin(degree);
		
		degree += speed;
	}
	
}
