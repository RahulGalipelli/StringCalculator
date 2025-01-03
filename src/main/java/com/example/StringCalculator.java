package com.example;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }
        String[] nums = numbers.split(delimiter);
        int sum =0;
        List<String> negatives = new ArrayList<>();
        for(String s: nums){
            int mynum = Integer.parseInt(s);
            if (mynum < 0) negatives.add(s);
            sum += mynum;
        }
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + String.join(", ", negatives));
        }
        return sum;
    }
}