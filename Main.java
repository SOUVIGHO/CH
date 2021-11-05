import java.util.Scanner;

public class Main{
    public static void main (String[] args) throws java.lang.Exception
    {
        java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
        
        /*String s;
        while (!(s=r.readLine()).startsWith("42")) System.out.println(s);
        */
        /*
        //===========NOV21C/problems/CHEAPFUEL============== [EASY]
        int T= Integer.parseInt(r.readLine());
        while(T-->0){
            String[] input=r.readLine().split(" ");
            int X=Integer.parseInt(input[0]),Y=Integer.parseInt(input[1]),A=Integer.parseInt(input[2]),B=Integer.parseInt(input[3]),K=Integer.parseInt(input[4]);
            String result=(X+A*(K-1))==(Y+B*(K-1))?"SAME PRICE" : (X+A*(K-1))<(Y+B*(K-1))? "PETROL":"DIESEL";
            System.out.println(result);
        }
        */
        
    }
}