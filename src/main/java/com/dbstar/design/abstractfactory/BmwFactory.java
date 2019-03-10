package com.dbstar.design.abstractfactory;

/**
 * @describe:
 * @className: BmwFactory
 * @author: dongbx
 * @date: 2019/03/10
 * @version: 1.0
 */
public class BmwFactory implements ICarFactory {
	@Override
	public IBussinessCar createBussinessCar() {
		return new BmwBussinessCar();
	}

	@Override
	public ISportCar createSportCar() {
		return new BmwSportCar();
	}
}
