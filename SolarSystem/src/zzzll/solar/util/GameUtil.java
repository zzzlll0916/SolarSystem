package zzzll.solar.util;
/**
 * 游戏开发中常用的工具类，例如图片加载等方法
 * @author zzzlll
 *
 */

import java.awt.Image;
import java.awt.Toolkit;


public class GameUtil {

	private GameUtil() {} //一般将工具类的构造方法私有，我们只需要调用它的静态方法就可以了
	
	public static Image getImage(String path) {
		
		return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));
		
	}
}
