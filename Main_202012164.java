import java.util.Scanner;

public class Main_202012164 {

    public static void main(String[] args) {
        System.out.println("lab0_4: 이윤아");

        // 오름차순으로 정렬된 배열 array 초기화
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // 대체할 원소를 입력받음
        Scanner yoonahscanner = new Scanner(System.in);
        int item = yoonahscanner.nextInt();

        /// 오름차순으로 정렬된 배열 array에서 마지막 원소를 item으로 대체
        // ..
        array[array.length - 1] = item;

 
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            } else {
                break;  
            }
        }

        // 오름차순으로 정렬된 배열 내용 출력
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        yoonahscanner.close();
    }
}
