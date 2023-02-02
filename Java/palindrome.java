import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String p = "";
        
        int length = A.length();

        for (int i = (length - 1); i >= 0; i--){
            p = p + A.charAt(i);
        }
        if(A.equals(p)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}