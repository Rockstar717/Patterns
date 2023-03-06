package pattern;
public class Patt1to12to333 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 5; i >0; i--) {
			for (int j =0 ; j < i; j++) {
				//System.out.print(j+1);
				if (i==2||i==1||i==3||i==4||i==5) {
					System.out.print(i);
				}
				 else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				//System.out.print(j+1);
				if(i==2||i==5) {
					System.out.print(i);
				}else {
				System.out.print(j);
			}
		}
			System.out.println();
			}
		}
	}
