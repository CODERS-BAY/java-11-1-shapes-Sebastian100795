package com.codersbay.gerhofer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {
    @Test
    public void testSquare() {


        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        Assertions.assertEquals(s4.getArea(), 6.6*6.6);
    }

    @Test
    public void illegalSquareTest(){
        assertThrows(IllegalArgumentException.class, () ->  {
            Square s = new Square(-2.0);
        });
    }
}
