// HackerRank printf solution 
// Adam Plesca
// 20/4/23

import java.util.Scanner;

public class printfSolution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++) //for loop accepts 3 lins of user input
            {
                String s1=sc.next(); 
                int x=sc.nextInt();
                System.out.printf("%-14s %03d\n",s1,x); //%s left justifies and %d adds decimal 
            }
            System.out.println("================================");
            sc.close();
    }
}