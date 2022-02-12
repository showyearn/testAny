/**
 * 
 */
package testall.designpattern.creatingpattern.singletonpattern;

/**
 * 懒汉式单例（非线程安全）
 * 
 * @author qiuquanying
 *
 */
public class LazySingletonUnSafe {
	private static LazySingletonUnSafe instance = null; // 不使用volatile关键词存在非线程安全问题

	private LazySingletonUnSafe() {
	} // private 避免类在外部被实例化

	public static LazySingletonUnSafe getInstance() {
		// getInstance 方法前不加同步关键词synchronized存在非线程安全问题
		if (instance == null) {
			instance = new LazySingletonUnSafe();
		}
		return instance;
	}
}
