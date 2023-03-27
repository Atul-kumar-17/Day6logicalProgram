public class Fibonacci_Series {
    public static void main(String[] args) {
        int x=0;
        int y=1;
        int z;
        System.out.println("Fibonacci Series :");
        System.out.println(x+ "");
        for (int i =1 ; i<=10; i++){
            z=x+y;
            System.out.println(z+"\t");
            x=y;
            y=z;
        }
    }
}
