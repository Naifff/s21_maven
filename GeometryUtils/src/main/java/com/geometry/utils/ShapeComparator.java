package com.geometry.utils;

import com.geometry.shapes.Shape;

public class ShapeComparator {
    public static int compareByArea(Shape shape1, Shape shape2) {
        return Double.compare(shape1.getArea(), shape2.getArea());
    }

    public static int compareByPerimeter(Shape shape1, Shape shape2) {
        return Double.compare(shape1.getPerimeter(), shape2.getPerimeter());
    }
}