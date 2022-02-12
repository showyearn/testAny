/**
 * 
 */
package testall.designpattern.creatingpattern.singletonpattern;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 单例模式测试
 * 
 * @author qiuquanying
 *
 */
public class SingletonPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 线程安全
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		System.out.println("lazySingleton1=" + lazySingleton1);
		System.out.println("lazySingleton2=" + lazySingleton2);
		HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
		HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
		System.out.println("hungrySingleton1=" + hungrySingleton1);
		System.out.println("hungrySingleton2=" + hungrySingleton2);

		// 非线程安全
		Callable<Object> callable = new LazySingletonUnSafeCallable();
		for (int i = 0; i < 10; i++) {
            FutureTask<Object> task = new FutureTask<Object>(callable);
            new Thread(task,"子线程"+ i).start();
            try {
                //获取子线程的返回值
                System.out.println("子线程返回值1："+task.get() + "");
            }  catch (Exception e) {
                e.printStackTrace();
            }
        }
	}

}
