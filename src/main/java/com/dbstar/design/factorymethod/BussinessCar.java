package com.dbstar.design.factorymethod;

/**
 * @describe:
 * @className: BussinessCar
 * @author: dongbx
 * @date: 2019/03/10
 * @version: 1.0
 */
public class BussinessCar implements ICar {
	@Override
	public void run() {
		System.out.println("wo shi bussiness car....");
	}
}
