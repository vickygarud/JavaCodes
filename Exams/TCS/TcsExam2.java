package TCS;

import java.util.Scanner;

public class TcsExam2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Total value of N : ");
		int no = sc.nextInt();

		int dist[] = new int[no];

		System.out.print("enter district: ");
		for (int k = 0; k < dist.length; k++) {
			dist[k] = sc.nextInt();
		}

		// int dist[] = {1,2,3,4,5,6,7,8,9,10};

		System.out.println("Districts that achived target: ");
		int target = sc.nextInt(); // 3

		int arr[] = new int[target];

		System.out.println("Enter Input: ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		int achive[] = new int[no - target];
		int i = 0;
		for (int j = 0; j < dist.length; j++) {
			if (arr[0] != dist[j] && arr[1] != dist[j])// && arr[2]!=dist[j]) //
				achive[i++] = dist[j];

		}

		/*
		 * for(int j=0; j<achive.length; j++) { System.out.print(achive[j]+" "); }
		 */

		System.out.print("C:");
		for (int j = 0; j < achive.length; j++) {
			if (j % 2 == 0) {
				System.out.print(achive[j] + " ");
			}
		}
		System.out.print("\nS:");
		for (int j = 0; j < achive.length; j++) {
			if (j % 2 != 0) {
				System.out.print(achive[j] + " ");
			}

		}

	}

}

// odd - 1 3 5 7 9
// even -2 4 6 8 10

// 0 1 2 3 4 5 6 7

//
//  1 2 3 4 5 6 7 8 9 10   - Dist
//  0 1 2 3 4 5 6 7 8 9    - index

//  1 2 3
//  0 1 2 
/*
 * 
 * 
 * dist[] = N X = no of dist achive target
 * 
 * target =3 Dist wo achive target = 2,3,5 Remaing = 1,4,6,7,8,9,10 0 1 2 4 5 6
 * 7
 * 
 * lowest central no=1 lowest state goverment =4
 * 
 * dist allotted central = 1 6 8 10 dist allotted state goverment = 4 7 9
 * 
 * ex-1
 * 
 * 
 * N=10 X=3 {5,2,3}
 * 
 * C: 1 6 8 10; S: 4 7 9
 * 
 * ex- 2 N = 3 X = 2 {3,2}
 * 
 * O/P- C:1;S
 * 
 * 
 * 
 * 
 * 1 4 6 7 8 9 10 0 1 2 3 4 5 6
 * 
 * 0 2 4 6
 * 
 * 
 */