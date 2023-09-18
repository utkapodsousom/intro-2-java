package com.mycompany.chapter3;

import java.io.IOException;
import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int aiNumber = (int) (Math.random() * 3);
		int userNumber = input.nextInt();
		String aiFigure = aiNumber == 0 ? "scissor"
				  : aiNumber == 1 ? "rock"
				    : "paper";
		String userFigure = userNumber == 0 ? "scissor"
				    : userNumber == 1 ? "rock"
				      : "paper";
		input.close();
		if (userNumber == aiNumber) {
			System.out.println("The computer is " + aiFigure + ". You are "
				+ userFigure + ". It is a draw");
		} else if ((userNumber == 0 && aiNumber == 2)
			|| (userNumber == 1 && aiNumber == 0)
			|| (userNumber == 2 && aiNumber == 1)) {
			System.out.println("The computer is " + aiFigure + ". You are "
				+ userFigure + ". You won");
		} else {
			System.out.println("The computer is " + aiFigure + ". You are "
				+ userFigure + ". You lose");
		}
	}
}
