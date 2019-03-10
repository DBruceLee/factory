package com.dbstar.design.factorymethod;

/**
 * @describe:
 * @className: FactoryMethodTest
 * @author: dongbx
 * @date: 2019/03/10
 * @version: 1.0
 */
public class FactoryMethodTest {
	public static void main(String[] args){
	    ICarFactory factory = new BussinessCarFactory();
		ICar car = factory.create();
		car.run();

		ICarFactory factory1 = new SportCarFactory();
		ICar car1 = factory1.create();
		car1.run();
	}
}
