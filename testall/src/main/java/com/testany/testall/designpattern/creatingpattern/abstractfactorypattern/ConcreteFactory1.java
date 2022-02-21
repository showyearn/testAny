/**
 * 
 */
package com.testany.testall.designpattern.creatingpattern.abstractfactorypattern;

/**
 * 具体工厂1：实现了厂品的生成方法
 * 
 * @author qiuquanying
 *
 */
public class ConcreteFactory1 implements AbstractFactory {

	public Product1 newProduct1() {
		return new ConcreteProduct11();
	}

	public Product2 newProduct2() {
		return new ConcreteProduct21();
	}

}
