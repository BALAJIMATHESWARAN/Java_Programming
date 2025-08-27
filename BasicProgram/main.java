import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a Mark on Tamil:");
        int Tamil=sc.nextInt();
        System.out.print("Enter a Mark on English:");
        int English=sc.nextInt();
        System.out.print("Enter a Mark on Maths:");
        int Maths=sc.nextInt();
        System.out.print("Enter a Mark on Science:");
        int Science=sc.nextInt();
        System.out.print("Enter a Mark on Social:");
        int Social=sc.nextInt();
        
        int Avg=(Tamil+English+Maths+Science+Social)/5;
        
        System.out.println("The Average is:"+Avg);
        
        if(Avg>=90){
            System.out.println("Excellent "+Avg);
        }else if(Avg>=75 && Avg<90){
            System.out.println("Good "+Avg);
        }else if(Avg>=50 && Avg<75){
            System.out.println("Average "+Avg);
        }else{
            System.out.println("Needs Improvement "+Avg);
        }
        sc.close();
    }
}