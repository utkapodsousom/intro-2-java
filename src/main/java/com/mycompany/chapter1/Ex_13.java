package com.mycompany.chapter1;

/**
 *
 * @author ootka
 */
public class Ex_13 {

	public static void main(String[] args) {
		// a = 3.4, b = 50.2, e = 44.5
		// c = 2.1, d = .55, f = 5.9
		System.out.println(
			(44.5 * .55 - 50.2 * 5.9)
			/ (3.4 * .55 - 50.2 * 2.1)
		);
		System.out.println(
			(3.4 * 5.9 - 44.5 * 2.1)
			/ (3.4 * .55 - 50.2 * 2.1)
		);
	}
}