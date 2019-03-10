package com.dbstar.design.constant;

public enum ShapeEnum {
	SHAPE_RECTANGLE("rectangle"), SHAPE_SQUARE("square");
	private String shape;

	ShapeEnum(String shape) {
		this.shape = shape;
	}

	public String getShape() {
		return shape;
	}

	public static ShapeEnum getByShape(String shape) {
		for (ShapeEnum shapeEnum : values()) {
			if (shape.equals(shapeEnum.getShape())) {
				return shapeEnum;
			}
		}
		return null;
	}
}
