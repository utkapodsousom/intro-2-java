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
			+ (365 * 24 * 3600) / 7.0
			- (365 * 24 * 3600) / 13.0
			+ (365 * 24 * 3600) / 45.0);
		// year two
		System.out.println((312_032_486
			+ ((365 * 24 * 3600) / 7.0
			- (365 * 24 * 3600) / 13.0
			+ (365 * 24 * 3600) / 45.0) * 2)
		);
		// year three
		System.out.println((312_032_486
			+ ((365 * 24 * 3600) / 7.0
			- (365 * 24 * 3600) / 13.0
			+ (365 * 24 * 3600) / 45.0) * 3)
		);
		// year four
		System.out.println((312_032_486
			+ ((365 * 24 * 3600) / 7.0
			- (365 * 24 * 3600) / 13.0
			+ (365 * 24 * 3600) / 45.0) * 4)
		);
		// year five
		System.out.println((312_032_486
			+ ((365 * 24 * 3600) / 7.0
			- (365 * 24 * 3600) / 13.0
			+ (365 * 24 * 3600) / 45.0) * 5)
		);
	}
}
