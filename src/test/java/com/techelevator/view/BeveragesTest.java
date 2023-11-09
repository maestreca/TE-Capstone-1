package com.techelevator.view;

import com.techelevator.Beverages;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeveragesTest {
    @Test
    public void testVendingMessage(){
        //Arrange
        Beverages beverages= new Beverages("Heavy",1.50, "C4");

        //Act
        String message = beverages.vendingMessage();

        assertEquals("Glug Glug, Chug Chug!", message);

    }
}
