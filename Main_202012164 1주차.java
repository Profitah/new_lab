import java.util.Scanner;

public class Main_202012164 {

    public static void main(String[] args) {
        System.out.println("lab0_1:이윤아"); 

        Scanner scScanner = new Scanner(System.in);

        // 정수 개수 입력받기
        int n = scScanner.nextInt();

        // 크기가 n인 정수 배열 arrNumarray 생성
        int[] arrNumarray = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arrNumarray[idx] = scScanner.nextInt();
        }

        // 크기가 10인 정수 배열 arrCount 생성
        int[] arrCount = new int[10];
        for (int idx = 0; idx < n; idx++) {
            int indexValue = arrNumarray[idx];
            if (indexValue >= 0 && indexValue <= 9) {
                arrCount[indexValue]++;
            }
        }

        // n개의 정수를 입력받아 양수만 출력
        for (int i = 0; i < arrCount.length; i++) {
            System.out.print(arrCount[i] + " ");  
        }

        scScanner.close(); 
    }
}
