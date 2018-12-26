package Hobys;

import java.math.BigInteger;
import java.util.Random;

public class Test3344 {

    public static void main(String[] args) {

        BigInteger bigInteger = new BigInteger("900000000000000000000000000000");// uper limit
        BigInteger min = new BigInteger("100000000000000000000000005");// lower limit
        BigInteger bigInteger1 = bigInteger.subtract(min);
        Random rnd = new Random();
        int maxNumBitLength = bigInteger.bitLength();

        BigInteger aRandomBigInt;

        aRandomBigInt = new BigInteger(maxNumBitLength, rnd);
        if (aRandomBigInt.compareTo(min) < 0)
            aRandomBigInt = aRandomBigInt.add(min);
        if (aRandomBigInt.compareTo(bigInteger) >= 0)
            aRandomBigInt = aRandomBigInt.mod(bigInteger1).add(min);

        System.out.println(aRandomBigInt);
    }

}
