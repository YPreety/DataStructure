package String_Array;

/*Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.
Input: arr[] = {3, 1, 4, 6, 5}
Output: True
There is a Pythagorean triplet (3, 4, 5).

Input: arr[] = {10, 4, 6, 12, 5}
Output: False
There is no Pythagorean triplet
Time Complexity of the above solution is O(n3).

*/
public class PythagoreanTriplet {

	static boolean isTriplet(int ar[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					// Calculate square of array elements
					int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];

					if (x == y + z || y == x + z || z == x + y)
						return true;
				}
			}
		}

		// If we reach here, no triplet found
		return false;
	}

	// Driver program to test above function
	public static void main(String[] args) {
		int ar[] = { 3, 1, 4, 6, 5 };
		int ar_size = ar.length;
		if (isTriplet(ar, ar_size) == true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
