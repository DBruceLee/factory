package com.dbstar.design.simplefactory;

import com.dbstar.designpattern.constant.ShapeEnum;

/**
 * @describe:
 * @className: SimpleFactoryTest
 * @author: dongbx
 * @date: 2019/03/08
 * @version: 1.0
 */
public class SimpleFactoryTest {
	public static void main(String[] args) {
		IShape shape = ShapeFactory.createShape(ShapeEnum.SHAPE_RECTANGLE.getShape());
		shape.selfIntroduction();
		ShapeFactory.createShape(ShapeEnum.SHAPE_SQUARE.getShape()).selfIntroduction();
	}
}
