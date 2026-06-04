package pkgs.pkgExes;

import java.util.Arrays;

public class Exe001 {



	public static void main(String[] args) {
		new Exe001().go(args);
	}

	private void go(String[] args) {

		System.out.println();
		System.out.println("[new int[] { 1 , 2 , 3} == new int[] { 1 , 2 , 3}="+(new int[] { 1 , 2 , 3} == new int[] { 1 , 2 , 3})+"]");

		System.out.println();
		System.out.println("[Arrays.equals(new int[] { 1 , 2 , 3} , new int[] { 1 , 2 , 3})="+(Arrays.equals(new int[] { 1 , 2 , 3} , new int[] { 1 , 2 , 3}))+"]");
		System.out.println("[Arrays.equals(new int[] { 1 , 2 , 3} , new int[] { 1 , 2 , 4})="+(Arrays.equals(new int[] { 1 , 2 , 3} , new int[] { 1 , 2 , 4}))+"]");
		System.out.println("[Arrays.equals(new int[] { 1 , 2 , 3} , new int[] { 3 , 2 , 1})="+(Arrays.equals(new int[] { 1 , 2 , 3} , new int[] { 3 , 2 , 1}))+"]");
		System.out.println("[Arrays.equals(new int[] { 1 , 2 , 3} , new int[] { 1 , 2})="+(Arrays.equals(new int[] { 1 , 2 , 3} , new int[] { 1 , 2}))+"]");
		System.out.println("[Arrays.equals(new int[] { 1 , 2} , new int[] { 1 , 2 , 3})="+(Arrays.equals(new int[] { 1 , 2} , new int[] { 1 , 2 , 3}))+"]");
		System.out.println("[Arrays.equals(new int[] { 4 , 5 , 6} , new int[] { 7 , 8 , 9})="+(Arrays.equals(new int[] { 4 , 5 , 6} , new int[] { 7 , 8 , 9}))+"]");

		System.out.println();
		System.out.println("[Arrays.compare(new int[] { 1 , 2 , 3} , new int[] { 1 , 2 , 3})="+(Arrays.compare(new int[] { 1 , 2 , 3} , new int[] { 1 , 2 , 3}))+"]");
		System.out.println("[Arrays.compare(new int[] { 1 , 2 , 3} , new int[] { 1 , 2 , 4})="+(Arrays.compare(new int[] { 1 , 2 , 3} , new int[] { 1 , 2 , 4}))+"]");
		System.out.println("[Arrays.compare(new int[] { 1 , 2 , 3} , new int[] { 3 , 2 , 1})="+(Arrays.compare(new int[] { 1 , 2 , 3} , new int[] { 3 , 2 , 1}))+"]");
		System.out.println("[Arrays.compare(new int[] { 1 , 2 , 3} , new int[] { 1 , 2})="+(Arrays.compare(new int[] { 1 , 2 , 3} , new int[] { 1 , 2}))+"]");
		System.out.println("[Arrays.compare(new int[] { 1 , 2} , new int[] { 1 , 2 , 3})="+(Arrays.compare(new int[] { 1 , 2} , new int[] { 1 , 2 , 3}))+"]");
		System.out.println("[Arrays.compare(new int[] { 4 , 5 , 6} , new int[] { 7 , 8 , 9})="+(Arrays.compare(new int[] { 4 , 5 , 6} , new int[] { 7 , 8 , 9}))+"]");

		System.out.println();
		System.out.println("[Arrays.mismatch(new int[] { 1 , 2 , 3} , new int[] { 1 , 2 , 3})="+(Arrays.mismatch(new int[] { 1 , 2 , 3} , new int[] { 1 , 2 , 3}))+"]");
		System.out.println("[Arrays.mismatch(new int[] { 1 , 2 , 3} , new int[] { 1 , 2 , 4})="+(Arrays.mismatch(new int[] { 1 , 2 , 3} , new int[] { 1 , 2 , 4}))+"]");
		System.out.println("[Arrays.mismatch(new int[] { 1 , 2 , 3} , new int[] { 3 , 2 , 1})="+(Arrays.mismatch(new int[] { 1 , 2 , 3} , new int[] { 3 , 2 , 1}))+"]");
		System.out.println("[Arrays.mismatch(new int[] { 1 , 2 , 3} , new int[] { 1 , 2})="+(Arrays.mismatch(new int[] { 1 , 2 , 3} , new int[] { 1 , 2}))+"]");
		System.out.println("[Arrays.mismatch(new int[] { 1 , 2} , new int[] { 1 , 2 , 3})="+(Arrays.mismatch(new int[] { 1 , 2} , new int[] { 1 , 2 , 3}))+"]");
		System.out.println("[Arrays.mismatch(new int[] { 4 , 5 , 6} , new int[] { 7 , 8 , 9})="+(Arrays.mismatch(new int[] { 4 , 5 , 6} , new int[] { 7 , 8 , 9}))+"]");

	}

}
