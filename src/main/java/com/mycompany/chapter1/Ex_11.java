/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter1;

/**
 *
 * @author ootka
 */
public class Ex_11 {

	public static void main(String[] args) {
		// year one
		System.out.println(312_032_486
			+ (365 * 24 * 3600) / 7
			- (365 * 24 * 3600) / 13
			+ (365 * 24 * 3600) / 45);
		// year two
		System.out.println((312_032_486
			+ ((365 * 24 * 3600) / 7
			- (365 * 24 * 3600) / 13
			+ (365 * 24 * 3600) / 45) * 2)
		);
		// year three
		System.out.println((312_032_486
			+ ((365 * 24 * 3600) / 7
			- (365 * 24 * 3600) / 13
			+ (365 * 24 * 3600) / 45) * 3)
		);
		// year four
		System.out.println((312_032_486
			+ ((365 * 24 * 3600) / 7
			- (365 * 24 * 3600) / 13
			+ (365 * 24 * 3600) / 45) * 4)
		);
		// year five
		System.out.println((312_032_486
			+ ((365 * 24 * 3600) / 7
			- (365 * 24 * 3600) / 13
			+ (365 * 24 * 3600) / 45) * 5)
		);
	}
}
