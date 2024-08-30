import java.util.Scanner;

public class Main_202012164 {
    public static void main(String[] args) {
        System.out.println("lab0_3: 이윤아");

        int[] sortedArray = arrayArray();
        int itemToSearch = getUserInput();

        int searchIndex = binarySearch(sortedArray, itemToSearch);
        System.out.println(searchIndex);
    }

    // 정렬된 배열을 초기화하는 메소드
    private static int[] arrayArray() {
        return new int[]{20, 40, 60, 80, 100, 110, 120, 130, 150, 190, 200, 300, 400};
    }

    // 사용자로부터 검색할 원소를 입력받는 메소드
    private static int getUserInput() {
        Scanner sceneer = new Scanner(System.in);
        int input = sceneer.nextInt();
        sceneer.close();
        return input;
    }

    // // 정렬된 배열 array에서 원소를 이진 검색하여 위치(인덱스)를 출력
    private static int binarySearch(int[] array, int item) {
        return binarySearchHelper(array, 0, array.length - 1, item);
    }


    // 정렬된 배열 array[from...to] 에서 item을 이진검색하여 위치(인덱스)를 리턴하는 재귀 메소드
    // 검색 실패시 -1 리턴
    private static int binarySearchHelper(int[] array, int from, int to, int item) {
        if (from > to) return -1;

        int mid = (from + to) / 2;
        if (array[mid] == item) return mid;

        return (array[mid] > item) 
            ? binarySearchHelper(array, from, mid - 1, item) 
            : binarySearchHelper(array, mid + 1, to, item);
    }
}
