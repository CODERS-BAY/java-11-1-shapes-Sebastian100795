package com.codersbay.gerhofer;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class RectangleTest {

    @Test
    public void testRectangle() {
        Shape rectangle = new Rectangle(1.0, 2.0, "RED", false);
        assertEquals(rectangle.getArea(),2.0);
        assertEquals(rectangle.getPerimeter(),6.0);
    }

    @Test
    public void illegalArgumentTest() {

        assertThrows(IllegalArgumentException.class, () ->  {
            Rectangle r = new Rectangle(-2.0,-2.0);
        });
    }


}
