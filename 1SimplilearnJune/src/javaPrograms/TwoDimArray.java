package javaPrograms;

public class TwoDimArray {

	public static void main(String[] args) {

		/*
		int[][] marks = new int[3][4];
		
		//row1
		marks[0][0] = 35;//col1
		marks[0][1] = 42;//col2
		marks[0][2] = 55;//col3
		marks[0][3] = 38;//col4
		
		//row2
		marks[1][0] = 12;//col1
		marks[1][1] = 74;//col2
		marks[1][2] = 84;//col3
		marks[1][3] = 97;//col4

		//row3
		marks[2][0] = 78;//col1
		marks[2][1] = 22;//col2
		marks[2][2] = 44;//col3
		marks[2][3] = 93;//col4
*/

		int[][] marks1 = {{35, 42, 55, 38}, {12, 74, 84, 97}, {78, 22, 44, 93}};
		System.out.println("The no. of rows in the array marks1: "+marks1.length);
		System.out.println("The no. of cols. in the array marks1: "+marks1[0].length);
		
		for(int i=0; i<marks1.length; i++) {
			for(int j=0; j<marks1[0].length; j++) {
				System.out.print(marks1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
