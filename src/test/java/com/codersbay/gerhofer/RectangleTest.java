package com.codersbay.gerhofer;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
public class RectangleTest {

    @Test
    public void testRectangle() {
        Shapes rectangle = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getColor());


        Rectangle r1 = (Rectangle) rectangle;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());


    }

    @Test
    public void illegalArgumentTest() {

        assertThrows(IllegalArgumentException.class, () ->  {
            Rectangle r = new Rectangle(-2.0,-2.0);
        });
    }


}
