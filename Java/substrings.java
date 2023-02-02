import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String arr[]= new String[s.length()-k+1];
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for (int i=0;i<s.length()-k+1;i++){
             arr[i]=s.substring(i,i+k);
        }
        for(int j=0; j<arr.length-1;j++){
            for(int g=0; g<arr.length-1 ; g++){
                String p=arr[g];
                String q=arr[g+1];
                boolean t=true;
                String temp="";
                for (int w=0; w<k;w++){
                      char pkaCharacter=p.charAt(w);
                      int b=(int) pkaCharacter;
 
                      char qkaCharacter=q.charAt(w);
                      int c=(int)  qkaCharacter;
 
                      if(b==c) continue;
                      else if(b>c){
                           t=false;
                           break;
                          }
                      else if(b<c){
                           t=true;
                           break;
                          }
                }
                if(t==false) {
                    temp=arr[g+1];
                    arr[g+1]=arr[g];
                    arr[g]=temp;
                }
                else{ continue;}
            }
        }
        smallest+=arr[0];
        largest+=arr[arr.length-1];
        return smallest + "\n" + largest;
    }
        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}