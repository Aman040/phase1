package dataStructures;

public class MatrixMultiplication {
	static int r1 = 2, c1 = 3;
	static int r2 = 3, c2 = 2;
	public static void main(String[] args) {
		
		int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
		int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
		int product[][]=multiply(firstMatrix,secondMatrix,r1,c1,c2);
		display(product);
	}
	public static int[][] multiply(int firstMatrix[][],int secondMatrix[][],int r1,int c1,int c2){
		int product[][]=new int[r1][c2];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<c1;k++) {
					product[i][j]+=firstMatrix[i][k]*secondMatrix[k][j];
				}
			}
		}
		return product;
	}
	public static void display(int product[][]) {
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(product[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
