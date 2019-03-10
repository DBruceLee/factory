package com.dbstar.design.factorymethod;

/**
 * @describe:
 * @className: BussinessCarFactory
 * @author: dongbx
 * @date: 2019/03/10
 * @version: 1.0
 */
public class BussinessCarFactory implements ICarFactory {
	@Override
	public ICar create() {
		return new BussinessCar();
	}
}
