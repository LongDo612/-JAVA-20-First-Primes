import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of prime numbers: ");
        int amount = scanner.nextInt();
        int x = 2;
        int count = 0;
        while (count<amount){
            if (checkPrime(x)){
                System.out.println(x);
                count++;
            }
            x++;
        }
    }

    public static boolean checkPrime(int number) {
        if(number<2)
            return false;
        for (int i=2;i<=Math.sqrt(number);i++){
            if (number%i==0)
                return false;
        }
        return true;
    }

}
