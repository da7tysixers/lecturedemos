package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class WrapperTest {

    @Test
    public void wrapIntegerTest() {
        //Given
        Integer expected = 22;
        Wrapper<Integer> integerWrapper = new Wrapper<Integer>(expected);
        //When
        Integer actual = integerWrapper.getValue();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wrapDoubleTest() {
        //Given
        Double expected = 32.0d;
        Wrapper<Double> doubleWrapper = new Wrapper<>(expected);
        //Then
        Double actual = doubleWrapper.getValue();
        //When
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wrapStringTest(){
        //Given
        String expected = "Emmanuel";
        Wrapper<String> stringWrapper = new Wrapper<>(expected);
        //Then
        String actual = stringWrapper.getValue();
        //When
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void wrapScanTest() {
        // Given
        Wrapper<Scanner> scannerWrapper = new Wrapper<Scanner>(new Scanner(System.in));
        //When
        scannerWrapper.getValue();
        //Then


    }

    @Test
    public void wrapLongTest(){
        //Given
        Long expected = 55l;
        Wrapper<Long> longWrapper = new Wrapper<>(expected);
        //When
        Long actual = longWrapper.getValue();

        //Then
        Assert.assertEquals(expected, actual);
    }

}
