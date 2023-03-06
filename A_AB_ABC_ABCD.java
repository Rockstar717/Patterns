package pattern;

import java.util.Scanner;

public class A_AB_ABC_ABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Alpha =65;
		for(int i= 0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char) (Alpha+j));
			}
			System.out.println();
		}
	}
}
