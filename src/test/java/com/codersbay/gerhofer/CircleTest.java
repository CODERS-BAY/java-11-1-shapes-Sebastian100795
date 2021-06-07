package com.codersbay.gerhofer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {

    @Test
    public void testCircle(){
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());


        Circle c1 = (Circle)s1;
        Assertions.assertEquals( c1.getArea(), c1.getRadius()* c1.getRadius()*Math.PI);
    }
    @Test
    public void illegalArgumentTest() {

        assertThrows(IllegalArgumentException.class, () ->  {
            Circle c = new Circle(-2.0,"RED",false);
        });
    }
}
