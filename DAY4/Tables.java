import java.util.Scanner;
 public class Main{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number");
         int n=sc.nextInt();
         System.out.println("enter the range");
         int r=sc.nextInt();
        for(int i=1;i<=r;i++){
           System.out.println(i+"*"+n+"="+(i*n));
         }
     }
 }
