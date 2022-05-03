package com.lamhot.app.practice;

public class PrintText {

	public static void main(String args[]) {
		PrintText ob = new PrintText();
		int input = 3;
		int input2 = 10;
		ob.printSymbol(input);
		ob.printSymbol(input2);

	}

	private void printSymbol(int input) {
		if (input == 0) {
			System.out.println("");

		}
		
		StringBuilder sb = new StringBuilder();
		//n2
		for (int i = 0; i < input; i++) {
			
			for (int x = 0; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
