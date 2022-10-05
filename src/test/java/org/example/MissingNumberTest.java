package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    MissingNumber missingNumber = new MissingNumber();
    @Test
    public void missingNumber1(){
        int res = missingNumber.missingNumber(new int[]{3,0,1});
        assertEquals(2,res);
    }
}