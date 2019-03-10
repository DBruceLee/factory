package com.dbstar.design.factorymethod;

/**
 * @describe:
 * @className: SportCarFactory
 * @author: dongbx
 * @date: 2019/03/10
 * @version: 1.0
 */
public class SportCarFactory implements ICarFactory {
	@Override
	public ICar create() {
		return new SportCar();
	}
}
