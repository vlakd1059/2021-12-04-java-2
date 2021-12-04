import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// ①.번째 방법

		// 1. arr 배열을 {"수", "박"}으로 초기화 2. 입력받은 숫자에따라 수박수박수 출력

//		String[] arr = { "수", "박" };
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("==== 수박 게임 Start! ====");
//		System.out.print("숫자를 입력해주세요! >> ");
//		int n = sc.nextInt();
//
//		for (int i = 0; i < n; i++)
//
//		{
//			if (i % 2 == 0) {
//				System.out.print(arr[0]);
//			} else {
//				System.out.print(arr[1]);
//			}
//		}

		// ②.방법
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 수박 게임 Start! ====");
		System.out.print("숫자를 입력해주세요! >> ");
		int n = sc.nextInt();
		String[] arr = new String[n]; // 사용자 입력한값만큼 arr[입력한 수]생성
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				arr[i] = "수"; // 배열안에는 "수", "박" 이라는 글자가 순서대로 들어가도록 대입
			} else {
				arr[i] = "박";
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]); // 마지막으로 배열 출력.

			
//			int[] numarr = new int[5]; 
//			System.out.println(Arrays.toString(numarr));
			// 결과~> [0, 0, 0, 0, 0]

		}
	}
}