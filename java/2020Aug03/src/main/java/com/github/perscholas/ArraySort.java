package com.github.perscholas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySort {
    public ArrayList myArray;
    List<Double> firstList = Arrays.asList(1.0,3.0,5.0, 7.0, 9.0);
    List<Integer> sortedNumbers = Arrays.asList(3,4,5,7,12,15,17,23),
    secondSortedNumbers = Arrays.asList(3,5,7,9,10,13,15,18,13);



    public ArraySort(){
        myArray = new ArrayList();
    }


    public void listContain() {
        int A = 0;
        int B = 0;
        while (A < sortedNumbers.size() && B < secondSortedNumbers.size()) {
            Integer numOne = sortedNumbers.get(A), numTwo = secondSortedNumbers.get(B);
                if (numOne < numTwo) {
                    A++;
                }else if(numTwo < numOne) {
                    B++;
                }else {
                    myArray.add(numTwo);
                    A++; B++;
                }


        }//while

        System.out.println(myArray.toString());

    }//listContain
}
