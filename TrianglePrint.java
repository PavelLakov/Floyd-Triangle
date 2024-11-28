import java.util.Scanner;
		/********************************/
		/*****print a Floyd triangle*****/
		/*******************************/

public class TrianglePrint {

	public static void main(String[] args) {
		
		
		
		int rows = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the desired rows number: ");
		rows =scan.nextInt();
		scan.close();
		
		
		int c =1;
		System.out.println();
		for(int i=1;i<=rows;i++) { //loop for a row
			for(int j=0;j<i;j++) {// inner loop for columns
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
				
		}
	}

}
