package com.wipro.flowcontrolstatements;

public class Ex8 {

	public static void main(String[] args) {
		char colorCode = 'V';
		
		switch (colorCode) {
		case 'V':
			System.out.println("V->Violet");
			break;
		case 'R':
			System.out.println("R->Red");
			break;
		case 'G':
			System.out.println("G->Green");
			break;
		case 'B':
			System.out.println("B->Blue");
			break;
		case 'O':
			System.out.println("O->Orange");
			break;
		case 'Y':
			System.out.println("Y->Yellow");
			break;
		case 'W':
			System.out.println("W->White");
			break;
		default:
			System.out.println("Invalid Code");
		}

	}


}
