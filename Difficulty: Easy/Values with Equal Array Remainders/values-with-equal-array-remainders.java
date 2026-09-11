class Solution {
	public int sameMod(int[] arr) {
		// code here
		int gcd = 0;
		
		for (int i = 1; i < arr.length; i++) {
			gcd = findGCD(gcd, Math.abs(arr[i] - arr[0]));
		}
		
		if (gcd == 0)
			return - 1;
		
		int c = 0;
		
		for (int i = 1; i * i <= gcd; i++) {
			if (gcd % i == 0) {
				c++;
				
				if (i != gcd / i)
					c++;
			}
		}
		
		return c;
	}
	int findGCD(int b, int a) {
		while (b != 0) {
			int t = a%b;
			a = b;
			b = t;
		}
		return a;
	}
}
