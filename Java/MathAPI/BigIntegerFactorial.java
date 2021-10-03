package Java.MathAPI;

import java.math.BigInteger;

public class BigIntegerFactorial {

    public static void main(String[] args) {

        for(int i = 1; i< 44;i++){
            calculateFactorial(i);
        }

    }

    public static void calculateFactorial(int n){
        BigInteger bigInteger = BigInteger.ONE;
        for(int i = 1; i< n; i++){
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n+"!  = "+ bigInteger);
    }
}
