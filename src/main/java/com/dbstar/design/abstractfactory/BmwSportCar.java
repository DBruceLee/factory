package com.dbstar.design.abstractfactory;

/**
 * @describe:
 * @className: BmwSportCar
 * @author: dongbx
 * @date: 2019/03/10
 * @version: 1.0
 */
public class BmwSportCar implements ISportCar{
	@Override
	public void run() {
		System.out.println("i am bmw sport car");
	}
}
