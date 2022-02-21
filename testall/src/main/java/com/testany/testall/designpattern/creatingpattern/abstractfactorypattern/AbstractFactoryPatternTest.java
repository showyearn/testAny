/**
 * 
 */
package com.testany.testall.designpattern.creatingpattern.abstractfactorypattern;

/**
 * 抽象工厂模式测试
 * 
 * @author qiuquanying
 *
 */
public class AbstractFactoryPatternTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactory factory = (AbstractFactory) ReadXML1.getObject();
		factory.newProduct1().show();
		factory.newProduct2().show();
	}
}
