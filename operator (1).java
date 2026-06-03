package com.tcs.prep;

import java.util.*;
import java.lang.*;
import java.io.*;

public class operator {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (A > B) {
				System.out.println(">");

			} else if (A < B) {
				System.out.println("<");
			} else if (A == B) {
				System.out.println("=");
			}
		}

	}
}
