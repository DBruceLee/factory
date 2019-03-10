package com.dbstar.design.abstractfactory;

/**
 * @describe:
 * @className: AudiportCar
 * @author: dongbx
 * @date: 2019/03/10
 * @version: 1.0
 */
public class AudiportCar implements ISportCar{
	@Override
	public void run() {
		System.out.println("i am audi sport car");
	}
}
