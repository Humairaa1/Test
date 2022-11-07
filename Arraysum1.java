import java.util.Scanner;
public class Arraysum1{
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        int sum=0;
        int arr[]=new int[5];

        System.out.println("Enter 5 Number :");
        for(int i=0 ; i<5 ;i++){
            arr[i]=input.nextInt();
        }

        for(int i=0 ; i<5 ;i++){
            sum=sum+arr[i];
        }
        
        System.out.println(sum);

    }
}