class Solution {
    public int formPyramid(int[] arr) {
        // code here
                  int n = arr.length;

                  int[] left = new int[n];
                  int[] right = new int[n];

                  left[0] = arr[0];

                  for(int i = 1; i < n; i++) {
                      left[i] = Math.min(arr[i], left[i - 1] + 1);
                  }

                  right[n - 1] = arr[n - 1];

                  for(int i = n - 2; i >= 0; i--) {
                      right[i] = Math.min(arr[i], right[i + 1] + 1);
                  }

                  long total = 0;
                  long maxKeep = 0;

                  for(int x : arr)
                      total += x;

                  for(int i = 0; i < n; i++) {
                      int height = Math.min(left[i], right[i]);

                      height = Math.min(height, i + 1);
                      height = Math.min(height, n - i);

                      maxKeep = Math.max(maxKeep, (long) height * height);
                  }

                  return (int)(total - maxKeep);
              }
          }