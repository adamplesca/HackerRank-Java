// Java Loops 2
// Adam Plesca
// 21/4/23

import java.util.*;
import java.io.*;

public class Loops2 {
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){ //loop one gets input
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            for(int j=0;j<n;j++){ //loop two adds values
                a += b;

                if(j>0){
                    System.out.print(" ");
                }

                System.out.print(a);

                b = b * 2;
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
