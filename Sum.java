import java.util.Scanner;
public class Sum{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two number : ");
        int a,b,sum;
        a=input.nextInt();
        b=input.nextInt();
        sum=a+b;
         System.out.println(sum);
    }
}