package com.dbstar.design.simplefactory;

import com.dbstar.designpattern.constant.ShapeEnum;

/**
 * @describe:
 * @className: ShapeFactory
 * @author: dongbx
 * @date: 2019/03/08
 * @version: 1.0
 */
public class ShapeFactory {

	public static IShape createShape(String shapeName) {
		switch (ShapeEnum.getByShape(shapeName)) {
			case SHAPE_RECTANGLE:
				return new Rectangle();
			case SHAPE_SQUARE:
				return new Square();
			default:
				return null;
		}

	}
}
