// HackerRank Java Loops 1 
// Adam Plesca
// 20/4/23

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int result;
        for(int i = 1; i <= 10; i++){ //for loop cycles through 10 times
           result = (N * i); //multiples user input by loop cycle 
           System.out.println(N+" x "+i+" = "+result); //prints out on a new line, the times table for the user with whatever number they input
        }
       
        bufferedReader.close();
    }
}
