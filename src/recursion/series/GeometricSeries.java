package recursion.series;

/**
 * CORRECT...
 * 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
 * 
 * @author Durgesh
 *
 */
public class GeometricSeries {

	public static void main(String[] args) {
		//computing sum of the series
		// 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
		int k = 3;
		System.out.println("Geometric sum: " + findGeometricSum(k));
	}

	public static double findGeometricSum(int k) {
		if (k <= 0)
			return 1;
		//compute sum k-1 series 
		double sum = findGeometricSum(k-1);
		//adding k the element of the GP series
		sum += 1 / Math.pow(2, k );
		return sum;
	}
}

/**
 * Algorithm SUM OF GEOMETRIC SERIES
 * 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
 * 
 * 1. check if number K till which geometric series sum needs to be computed,
 *  is less than or equal to 1, return 1.
 * 
 * 2. Compute the sum of k-1 sequence of GP series, by making recursive 
 * call to same function by passing k-1 as parameter, and store returned value
 * in sum variable of type double
 * 
 * 3.Compute 1/power(2,k) and add to sum variable
 * 4. return the computed sum value now  
 */
