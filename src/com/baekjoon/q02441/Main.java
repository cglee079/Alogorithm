package com.baekjoon.q02441;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (N - i); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
