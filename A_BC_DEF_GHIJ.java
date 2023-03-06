package pattern;

import java.util.Scanner;

public class A_BC_DEF_GHIJ {
	public static void main(String[] args) {
		int Alpha = 65;
		/*for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (Alpha));
			}
				System.out.println();
				for(int k= 1;k<=2;k++) {
				System.out.print((char) (Alpha + k));
				}
				System.out.println();
				
				for(int l=3;l<=5;l++) {
				System.out.print((char)(Alpha + l));
				}
				System.out.println();
				
			   for(int m = 6;m<=9;m++) {
				System.out.print((char)(Alpha+m));
				}	
			   System.out.println();
			   
			   for(int n=10;n<=14;n++) {
				   System.out.print((char)(Alpha+n));
			   }
			}
		}
	}*/


   //Approach 2

		/*	int Alpha = 65;
			for (int i = 1; i <= 1; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print((char) (Alpha));
					System.out.println();
					System.out.println((char) (Alpha + j));
					System.out.print((char) (Alpha + j + i));
					System.out.println();
					System.out.print((char) (Alpha + j + i + 1));
					System.out.print((char) (Alpha + j + i + 2));
					System.out.print((char) (Alpha + j + i + 3));
					System.out.println();
					System.out.print((char) (Alpha + j + i + 4));
					System.out.print((char) (Alpha + j + i + 5));
					System.out.print((char) (Alpha + j + i + 6));
					System.out.print((char) (Alpha + j + i + 7));
				}
			}
		}
	}*/
		
		//Approach 3 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of printing line");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) Alpha);
				Alpha++;
			}
			System.out.println();
		}
	}
}