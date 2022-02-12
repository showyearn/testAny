/**
 * 
 */
package testall.designpattern.creatingpattern.factorymethodpattern;

/**
 * 工厂方法模式测试
 * 
 * @author qiuquanying
 *
 */
public class FactoryMethodPatternTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactory factory = (AbstractFactory) ReadXML1.getObject();
		factory.newProduct().show();
	}
}
