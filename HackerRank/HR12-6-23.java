// Hacker Rank Initialise Blocker 
// Adam Plesca
// 12/6/23

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       int B = sc.nextInt();
       int H = sc.nextInt();
       int output = 0;
       
       if(B > 0 && H > 0){
            output = B * H;
       }
       else if(B < 0 || H < 0){
           System.out.println("java.lang.Exception: Breadth and height must be positive");
           return;
       }
       else if(B >= 100 || H >= 100){
           System.out.println("java.lang.Exception: Breadth and height must be positive");
           return;
       }
       System.out.println(output);
       sc.close();
}
}