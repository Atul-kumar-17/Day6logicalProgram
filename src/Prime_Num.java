import java.util.Scanner;

public class Prime_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result =0;
        System.out.println("Enter a no.");
        int n= sc.nextInt();
        if (n==0||n==1){
            System.out.println(n+ " is not a prime no.");
        }else{
            for (int i=2;i<n ;i++){
                if (n%i==0){
                    System.out.println(n+ " is not a prime no.");
                    result=1;
                    break;
                }
                }
            if (result==0)
                System.out.println(n+ " is a prime");
            }
        }

    }

