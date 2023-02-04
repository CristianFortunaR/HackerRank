import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    //This defines number from 0 to 255
    String ip = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
    // Here i Just repeat the IP 4 times wich gives the total IPV4 pattern
    public String pattern = ip + "\\." + ip + "\\." + ip + "\\." + ip; 
}