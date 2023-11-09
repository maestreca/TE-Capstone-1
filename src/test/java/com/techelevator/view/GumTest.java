package com.techelevator.view;

import com.techelevator.Gum;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GumTest {
    @Test
    public void testVendingMessage(){
        //Arrange
        Gum gum = new Gum("Triplemint",0.75, "D4");

        //Act
        String message = gum.vendingMessage();

        assertEquals("Chew Chew, Pop!", message);

    }
}
