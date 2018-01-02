package zzzlll.solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import zzzll.solar.util.GameUtil;

public class Planet extends Star{

	//����ͼƬ�����꣬����������Բ���У����ᡢ���ᡢ�ٶȡ��Ƕȣ��ٶȵ�������������ĳ��star����
	
	double longAxis;
	double shortAxis;
	double speed;
	double degree;
	Star center;
	boolean statellite;//Ĭ��Ϊfalse
	
    public Planet(Star center,String imgpath,double longAxis,double shortAxis,
    		double speed,boolean statellite) {
		
		this(center, imgpath,longAxis,shortAxis,speed);//������һ��������
		this.statellite = statellite;
	}
	
	public Planet(Star center,String imgpath,double longAxis,double shortAxis,double speed) {
		
		super( GameUtil.getImage(imgpath));//���ø��๹��������Ⱥ͸߶ȶ����ˣ������ֵ��������
		
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
	
	//��д����draw������ʹ�������������������Ϊ��Բ
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
		 * ��ԭ��Ϊ���ĵ���Բ���̱��ʽΪ��x = a*cos��y = b*sin
		 * ��Բ���Կ���Բ��ĳ�����ϵ����죬���Ĳ��������ǣ�x=acos�� �� y=bsin��
		 */
		//������Բ�켣����
		x = center.x + width/2 + longAxis * Math.cos(degree);
		y = center.y + height/2 + shortAxis * Math.sin(degree);
		
		degree += speed;
	}
	
}
