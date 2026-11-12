package com.ArrayOperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    // numZero test #1
    @Test
    void ArrayOneTwoThreeReturnsZero(){
        int resultado = ArrayOperations.numZero(new int[]{1, 2, 3});
        assertEquals(0,resultado);
    };

    // numZero test #2
    @Test
    void ArrayOneZeroTwoZeroNumZeroReturnsTwo(){
        int resultado = ArrayOperations.numZero(new int[]{1, 0, 2, 0});
        assertEquals(2,resultado);
    };

    // numZero test #3
    @Test
    void ArrayZeroZeroZeroNumZeroReturnsThree(){
        int resultado = ArrayOperations.numZero(new int[]{0, 0, 0});
        assertEquals(3,resultado);
    };

    // numZero test #4
    @Test
    void ArrayNullReturnsZero(){
        int resultado = ArrayOperations.numZero(new int[]{});
        assertEquals(0,resultado);
    };

    // numZero test #5
    @Test
    void ArrayOneOneTwoFourFiveReturnsZero(){
        int resultado = ArrayOperations.numZero(new int[]{1, 1, 2, 4, 5});
        assertEquals(0,resultado);
    };

    // findLast  test #1
    @Test
    void ArrayOneOneOneFindlastOneReturnsTwo(){
        int resultado = ArrayOperations.findLast(new int[]{1, 1, 1}, 1);
        assertEquals(2,resultado);
    };

    // findLast  test #2
    @Test
    void ArrayOneTwoOneThreeFourOneFindlastOneReturnsFive(){
        int resultado = ArrayOperations.findLast(new int[]{1, 2, 1, 3, 4, 1}, 1);
        assertEquals(5,resultado);
    };

    // findLast  test #3
    @Test
    void ArrayTwoFourFiveFindlastTwoReturnsZero(){
        int resultado = ArrayOperations.findLast(new int[]{2, 4, 5}, 2);
        assertEquals(0,resultado);
    };

    // findLast  test #4
    @Test
    void ArrayOneTwoFiveSixFindlastTenReturnsMinusOne(){
        int resultado = ArrayOperations.findLast(new int[]{1, 2, 5, 6}, 10);
        assertEquals(-1,resultado);
    };

    // findLast  test #5
    @Test
    void ArrayNullReturnsMinusOne(){
        int resultado = ArrayOperations.findLast(new int[]{}, 2);
        assertEquals(-1,resultado);
    };

    // CountPositive test #1
    @Test
    void ArrayOneOneTwoThreeMinusOneMinusTwoCountPositiveReturnsFour(){
        int resultado = ArrayOperations.countPositive(new int[]{1, 1, 2, 3, -1, -2});
        assertEquals(4,resultado);
    };

    // CountPositive test #2
    @Test
    void ArrayTwoFourFiveCountPositiveReturnsThree(){
        int resultado = ArrayOperations.countPositive(new int[]{2, 4, 5});
        assertEquals(3,resultado);
    };

    // CountPositive test #3
    @Test
    void ArrayMinusOneZeroOneCountPositiveReturnsOne() {
        int resultado = ArrayOperations.countPositive(new int[]{-1, 0, 1});
        assertEquals(1, resultado);
    }

    // CountPositive test #4
    @Test
    void ArrayNullCountPositiveReturnsZero(){
        int resultado = ArrayOperations.countPositive(new int[]{});
        assertEquals(0,resultado);
    };

    // CountPositive test #5
    @Test
    void ArrayOneCountPositiveReturnsOne(){
        int resultado = ArrayOperations.countPositive(new int[]{1});
        assertEquals(1,resultado);
    };

    // lastZero test #1
    @Test
    void ArrayZeroOneOneOneLastZeroReturnsZero(){
        int resultado = ArrayOperations.lastZero(new int[]{0, 1, 1, 1});
        assertEquals(0,resultado);
    };

    // lastZero test #2
    @Test
    void ArrayOneOneOneTwoThreeLastZeroReturnsMinusOne(){
        int resultado = ArrayOperations.lastZero(new int[]{1, 1, 1, 2, 3});
        assertEquals(-1,resultado);
    };

    // lastZero test #3
    @Test
    void ArrayZeroOneZeroZeroTwoFourZeroLastZeroReturnsSix(){
        int resultado = ArrayOperations.lastZero(new int[]{0, 1, 0, 0, 2, 4, 0});
        assertEquals(6,resultado);
    };

    // lastZero test #4
    @Test
    void ArrayZeroOneOneOneOneOneOneOneOneZeroLastZeroReturnsTen(){
        int resultado = ArrayOperations.lastZero(new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0});
        assertEquals(10,resultado);
    };

    // lastZero test #5
    @Test
    void ArrayNullLastZeroReturnsMinusOne(){
        int resultado = ArrayOperations.lastZero(new int[]{});
        assertEquals(-1,resultado);
    };

    // oddOrPos  test #1
    @Test
    void ArrayMinusThreeMinusTwoZeroOneFouroddOrPosReturnsThree(){
        int resultado = ArrayOperations.oddOrPos(new int[]{-3, -2, 0, 1, 4});
        assertEquals(3,resultado);
    };

    // oddOrPos  test #2
    @Test
    void ArrayMinusOneMinusTwoMinusThreeoddOrPosReturnsTwo(){
        int resultado = ArrayOperations.oddOrPos(new int[]{-1, -2, -3});
        assertEquals(2,resultado);
    };

    // oddOrPos test #3
    @Test
    void ArrayZeroZeroZeroOddOrPosReturnsZero(){
        int resultado = ArrayOperations.oddOrPos(new int[]{0, 0, 0});
        assertEquals(0, resultado);
    }

    // oddOrPos test #4
    @Test
    void ArrayOneTwoThreeFourOddOrPosReturnsFour(){
        int resultado = ArrayOperations.oddOrPos(new int[]{1, 2, 3, 4});
        assertEquals(4, resultado);
    }

    // oddOrPos test #5
    @Test
    void ArrayMinusFiveMinusFourMinusThreeMinusTwoOddOrPosReturnsTwo(){
        int resultado = ArrayOperations.oddOrPos(new int[]{-5, -4, -3, -2});
        assertEquals(2, resultado);
    }
}