package com.example.employee.service;
import org.springframework.stereotype.Service;

@Service
public class PracticeService {
    public int sum(int[] numbers){
        int sum=0;
        for( int i: numbers){
            sum = sum+i;
        }
        return sum;
    }



}
