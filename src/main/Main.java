package main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        BigDecimal num = new BigDecimal(8.696969);

        System.out.println(rounder(num));
        System.out.println(reverseSign(num));



    }


    public static double rounder(BigDecimal num) {

        return num.setScale(2, RoundingMode.HALF_UP).doubleValue();

    }

    public static BigDecimal reverseSign(BigDecimal num) {

        BigDecimal num2 = new BigDecimal(-1);

        BigDecimal reverseResult = num.multiply(num2);

        return reverseResult.setScale(1,RoundingMode.HALF_UP);

    }

}





