/**
 * 
 */
package testall.designpattern.creatingpattern.abstractfactorypattern;

/**
 * 具体工厂2：实现了厂品的生成方法
 * 
 * @author qiuquanying
 *
 */
public class ConcreteFactory2 implements AbstractFactory {

	public Product1 newProduct1() {
		return new ConcreteProduct12();
	}

	public Product2 newProduct2() {
		return new ConcreteProduct22();
	}

}
