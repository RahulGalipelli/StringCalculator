package com.example;


public class StringCalculator {
    public int add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }
        String[] nums = numbers.split(",|\n");
        int sum =0;
        for(String s: nums){
            sum += Integer.parseInt(s);
        }
        
        return sum;
    }
}