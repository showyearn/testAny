/**
 * 
 */
package testall.designpattern.creatingpattern.factorymethodpattern;

/**
 * 具体工厂1：实现了厂品的生成方法
 * 
 * @author qiuquanying
 *
 */
public class ConcreteFactory1 implements AbstractFactory {

	public Product newProduct() {
		System.out.println("具体工厂1生成-->具体产品1...");
		return new ConcreteProduct1();
	}

}
