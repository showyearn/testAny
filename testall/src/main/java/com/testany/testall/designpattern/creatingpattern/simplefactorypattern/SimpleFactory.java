/**
 * 
 */
package com.testany.testall.designpattern.creatingpattern.simplefactorypattern;

/**
 * 简单工厂
 * 
 * @author qiuquanying
 *
 */
public class SimpleFactory {

	final class Const {
		static final int PRODUCT_A = 0;
		static final int PRODUCT_B = 1;
		static final int PRODUCT_C = 2;
	}

	public static Product makeProduct(int kind) {
		switch (kind) {
		case Const.PRODUCT_A:
			return new ConcreteProduct1();
		case Const.PRODUCT_B:
			return new ConcreteProduct2();
		}
		return null;
	}
}
