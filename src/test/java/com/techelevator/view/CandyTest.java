package com.techelevator.view;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyTest {
    @Test
    public void testVendingMessage(){
        //Arrange
        Candy candy= new Candy("Crunchie",1.75, "B4");

        //Act
        String message = candy.vendingMessage();

        assertEquals("Munch Munch, Mmm Mmm Good!", message);

    }
}
