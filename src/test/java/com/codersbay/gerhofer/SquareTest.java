package com.codersbay.gerhofer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {
    @Test
    public void testSquare() {


        Shapes s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());

        System.out.println(r2.getLength());


        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }

    @Test
    public void illegalSquareTest(){
        assertThrows(IllegalArgumentException.class, () ->  {
            Square s = new Square(-2.0);
        });
    }
}
