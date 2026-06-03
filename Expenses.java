package com.tcs.prep;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Expenses {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N1 = sc.nextInt();
			int N2 = sc.nextInt();
			double expense = N1 * N2;

			if (N1 >= 1000) {
				expense = expense - (expense * 0.10);
			}
			System.out.println(expense);
		}
	}
}
