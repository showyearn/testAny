/**
 * 
 */
package testall.designpattern.creatingpattern.singletonpattern;

/**
 * 饿汉式单例
 * 
 * @author qiuquanying
 *
 */
public class HungrySingleton {
	private static final HungrySingleton instance = new HungrySingleton();

	private HungrySingleton() {
	}

	public static HungrySingleton getInstance() {
		return instance;
	}
}
