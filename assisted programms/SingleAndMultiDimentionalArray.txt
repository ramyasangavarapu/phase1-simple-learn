package assignProj;

public class SingleAndMultiDimensionalArray {

	public static void main(String[] args) {
		int[] a[] = {  {4,4,4}, {3,3,3}, {2,2,2} }, b = { 20 };

		// print 1D array
		System.out.println(b[0]);

		// print 2D array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = 100;
				System.out.println(a[i][j]);
			}

		}
	}
}
