package com.dbstar.design.abstractfactory;

/**
 * @describe:
 * @className: AudiFactory
 * @author: dongbx
 * @date: 2019/03/10
 * @version: 1.0
 */
public class AudiFactory implements ICarFactory {
	@Override
	public IBussinessCar createBussinessCar() {
		return new AudiBussinessCar();
	}

	@Override
	public ISportCar createSportCar() {
		return new AudiportCar();
	}
}
