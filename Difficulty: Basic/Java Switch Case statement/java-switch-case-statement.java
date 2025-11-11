// User function Template for Java

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        // code here
        switch(choice){
            case 1:
                return (Math.PI*Math.pow(arr.get(0),2));
            case 2:
                return (arr.get(0)*arr.get(1));
        }
        return 0.0;
    }
}