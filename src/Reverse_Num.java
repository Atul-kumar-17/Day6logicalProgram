import java.util.Scanner;

public class Reverse_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num= sc.nextInt();
        int reverse=0;
        for(;num!=0;num/=10){
            int digit = num%10;
            reverse=reverse*10+digit;
        }
        System.out.println("reversed number is : " +reverse);
    }
}
