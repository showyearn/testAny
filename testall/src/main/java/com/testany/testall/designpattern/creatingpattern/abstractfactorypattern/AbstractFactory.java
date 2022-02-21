/**
 * 
 */
package com.testany.testall.designpattern.creatingpattern.abstractfactorypattern;

/**
 * 抽象工厂：提供了产品的生成方法。
 * 
 * @author qiuquanying
 *
 */
public interface AbstractFactory {
	public Product1 newProduct1();

	public Product2 newProduct2();
}
