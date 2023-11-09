package com.techelevator.view;

import com.techelevator.Chips;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChipsTest {
    @Test
    public void testVendingMessage(){
        //Arrange
        Chips chips = new Chips("Stackers",1.45, "Chip");

        //Act
        String message = chips.vendingMessage();

        assertEquals("Crunch Crunch, It's Yummy!", message);

    }
}
