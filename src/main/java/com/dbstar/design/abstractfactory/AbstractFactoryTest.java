package com.dbstar.design.abstractfactory;

/**
 * @describe:
 * @className: AbstractFactoryTest
 * @author: dongbx
 * @date: 2019/03/10
 * @version: 1.0
 */
public class AbstractFactoryTest {
	public static void main(String[] args){
	      ICarFactory carFactory = new AudiFactory();
	      carFactory.createBussinessCar().run();
	      carFactory.createSportCar().run();

	      ICarFactory carFactory1 = new BmwFactory();
	      carFactory1.createBussinessCar().run();
	      carFactory1.createSportCar().run();
	}
}
