import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bigInteger {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        BigInteger a;
        BigInteger b;
        BigInteger sum = BigInteger.ZERO;
        BigInteger product;

        a = new BigInteger(Input.nextLine());
        b = new BigInteger(Input.nextLine());

        sum = sum.add(a);
        sum = sum.add(b);
        product = a.multiply(b);

        System.out.println(sum);
        System.out.println(product);
    }
}
