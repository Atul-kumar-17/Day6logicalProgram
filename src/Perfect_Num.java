import java.util.Scanner;

public class Perfect_Num {
    public static void main(String[] args) {
    int sum =0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. :");
    int n = sc.nextInt();
    for (int i =1 ; i<n; i++) {
        if (n%i == 0) {
            sum = sum + i;
        }
    }
        if (n == sum) {
            System.out.println("It is a perfect no. : " +n);
        }
        else{
            System.out.println("It is not a perfect no.");
        }

    }
    }

