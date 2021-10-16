package com.tahmid;
import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    @Override
    public BigInteger findFactorial(int n) {
        BigInteger ans = BigInteger.ONE;
        for(int i=1; i<= n; i++){
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }

}
