/**
 * 
 */
package testall.designpattern.creatingpattern.singletonpattern;

import java.util.concurrent.Callable;

/**
 * 使用Callable和Future创建线程
 * 
 * @author qiuquanying
 *
 */
public class LazySingletonUnSafeCallable implements Callable<Object> {

	public Object call() throws Exception {
		LazySingletonUnSafe lazySingletonUnSafe = LazySingletonUnSafe.getInstance();
		return lazySingletonUnSafe;
	}

}
