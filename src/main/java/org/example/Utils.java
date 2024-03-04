package org.example;
import java.util.Random;

public class Utils {

    public static boolean isPrime(int num) {
        for(int i = 2; i < (num/2)+1; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String reverse(String toReverse) {
        String toReturn = "";
        for(int i = toReverse.length(); i > 0; i--) {
            toReturn += toReverse.charAt(i);
        }
        return toReturn;
    }

    public static int somethingRandom(Random random) {
        //Random random = new Random();
        return random.nextInt(100);
    }
}
