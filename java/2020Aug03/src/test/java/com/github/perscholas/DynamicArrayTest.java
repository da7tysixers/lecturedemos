package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

import javax.jws.Oneway;

public class DynamicArrayTest {

    DynamicArray<String> myarray = new DynamicArray<String>();

    @Test
    public void addTest(){
        //Given
        String expected = "Emmanuel";

        //When
        myarray.add(expected);
        myarray.capacity();

        //then
        System.out.println(myarray.capacity());
        System.out.println(myarray.size());
        Assert.assertEquals(expected, myarray.getAt(0));

    }
}


