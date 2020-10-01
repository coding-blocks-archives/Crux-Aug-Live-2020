package com.company.Lec13;

public class KpC {
	static String arr[] = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kpc("123", "");
		//QueenPremutaion(new boolean[4], 2, 0, "");
		QueenCombinartion(new boolean[4], 2, 0, "",-1);

	}

	public static void kpc(String Ques, String ans) {
		if (Ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = Ques.charAt(0);
		String gt = arr[ch - 49]; // abc
		for (int i = 0; i < gt.length(); i++) {
			kpc(Ques.substring(1), ans + gt.charAt(i));
		}

	}

	public static void QueenPremutaion(boolean[] board, int tq, int qpsf, String ans) {
		if (tq == qpsf) {
			count++;
			System.out.println(count + "." + ans + " ");
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] != true) { // board empty h
				board[i] = true; // do
				QueenPremutaion(board, tq, qpsf + 1, ans + "q" + qpsf + "b" + i + " ");
				board[i] = false;// BackTracking undo
			}

		}

	}

	public static void QueenCombinartion(boolean[] board, int tq, int qpsf, String ans, int idx) {
		if (tq == qpsf) {
			count++;
			System.out.println(count + "." + ans + " ");
			return;
		}
		for (int i = idx + 1; i < board.length; i++) {
			if (board[i] != true) { // board empty h
				board[i] = true; // do
				QueenCombinartion(board, tq, qpsf + 1, ans + "q" + qpsf + "b" + i + " ", i);
				board[i] = false;// BackTracking undo
			}

		}

	}

}
