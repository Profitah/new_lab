import java.util.Scanner;

public class Main_202012164 {
    public static void main(String[] args) {
        System.out.println("lab0_2:이윤아");

        // 정수 개수 입력받기
        Scanner skener = new Scanner(System.in);
        int int_n = skener.nextInt();

        // n!를 구하여 출력
        int factorialOutcome = factorial(int_n);
        System.out.println(factorialOutcome);

        // 1부터 n까지 정수를 출력
        show(int_n);
        System.out.println(); 

        // 1부터 n까지 합을 구하여 출력_
        int sumOutcome = sum(int_n);
        System.out.println(sumOutcome);

        // n부터 1까지 수를 출력
        showReverse(int_n);
        System.out.println(); 
        

        skener.close();
    }

    // n!을 구하여 리턴하는 메소드
    private static int factorial(int n) {
        if(n == 1) return 1;
            else return n * factorial(n-1);
    }


    // 1 ~ n까지의 수를 합산
    private static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }

    //// 1부터 n까지 출력하는 메소드
    private static void show(int n) {
        if (n > 0) {
            show(n - 1); 
            System.out.print(n + " ");
        }
    }

    // n 부터 1 까지의 수를 출력한다.
    private static void showReverse(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            showReverse(n - 1); 
        }
    }

    private static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
