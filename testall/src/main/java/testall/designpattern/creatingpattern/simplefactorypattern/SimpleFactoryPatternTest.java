/**
 * 
 */
package testall.designpattern.creatingpattern.simplefactorypattern;

/**
 * 简单工厂模式（不在GoF 23 种设计模式之列）测试
 * 
 * @author qiuquanying
 *
 */
public class SimpleFactoryPatternTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product product0 = SimpleFactory.makeProduct(0);
		Product product1 = SimpleFactory.makeProduct(1);
		Product product2 = SimpleFactory.makeProduct(2);
		System.out.println("product0:");
		product0.show();
		System.out.println("product1:");
		product1.show();
		System.out.println("product2:" + product2);
	}

}
