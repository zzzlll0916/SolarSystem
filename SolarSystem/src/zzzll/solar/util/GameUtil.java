package zzzll.solar.util;
/**
 * ��Ϸ�����г��õĹ����࣬����ͼƬ���صȷ���
 * @author zzzlll
 *
 */

import java.awt.Image;
import java.awt.Toolkit;


public class GameUtil {

	private GameUtil() {} //һ�㽫������Ĺ��췽��˽�У�����ֻ��Ҫ�������ľ�̬�����Ϳ�����
	
	public static Image getImage(String path) {
		
		return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));
		
	}
}
