package com.org.jenkins;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int sum(int a,int b){
        return a + b;
    }

    public int division(int dividend,int divisor){
        if(divisor == 0){
            return 0;
        }
        return dividend/divisor;
    }
}
