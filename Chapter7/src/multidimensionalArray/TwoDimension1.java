package multidimensionalArray;

public class TwoDimension1 {
	public static void main(String[] args) {
		//2차원 배열 선언 방법
		int[][]arr = {{1,2,3},{4,5,6}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}
}
