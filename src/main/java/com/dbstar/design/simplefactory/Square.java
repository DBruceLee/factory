package com.dbstar.design.simplefactory;

/**
 * @describe:
 * @className: Rectangle
 * @author: dongbx
 * @date: 2019/03/08
 * @version: 1.0
 */
public class Square implements IShape{


	@Override
	public void selfIntroduction() {
		System.out.println("i am a Square");
	}
}
