package com.dbstar.design.abstractfactory;

/**
 * @describe:
 * @interfaceName: ICarFactory
 * @author: dbstar
 * @date: 2019/03/10
 * @version: 1.0
 */
public interface ICarFactory {
	IBussinessCar createBussinessCar();
	ISportCar createSportCar();

}
