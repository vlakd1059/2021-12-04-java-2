import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// ��.��° ���

		// 1. arr �迭�� {"��", "��"}���� �ʱ�ȭ 2. �Է¹��� ���ڿ����� ���ڼ��ڼ� ���

//		String[] arr = { "��", "��" };
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("==== ���� ���� Start! ====");
//		System.out.print("���ڸ� �Է����ּ���! >> ");
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

		// ��.���
		Scanner sc = new Scanner(System.in);
		System.out.println("==== ���� ���� Start! ====");
		System.out.print("���ڸ� �Է����ּ���! >> ");
		int n = sc.nextInt();
		String[] arr = new String[n]; // ����� �Է��Ѱ���ŭ arr[�Է��� ��]����
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				arr[i] = "��"; // �迭�ȿ��� "��", "��" �̶�� ���ڰ� ������� ������ ����
			} else {
				arr[i] = "��";
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]); // ���������� �迭 ���.

			
//			int[] numarr = new int[5]; 
//			System.out.println(Arrays.toString(numarr));
			// ���~> [0, 0, 0, 0, 0]

		}
	}
}