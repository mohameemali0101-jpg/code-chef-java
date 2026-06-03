package com.tcs.prep;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			char N = sc.next().charAt(0);

			if (N == 'B' || N == 'b') {
				System.out.println("BattleShip");
			} else if (N == 'C' || N == 'c') {
				System.out.println("Cruiser");
			} else if (N == 'D' || N == 'd') {
				System.out.println("Destroyer");
			} else if (N == 'F' || N == 'f') {
				System.out.println("Frigate");
			}
		}

	}
}
