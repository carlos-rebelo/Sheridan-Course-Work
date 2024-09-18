package yourturn1;

import java.lang.Math;

public class OverloadedFun {

    public int findLargest(int num1, int num2) {
        return Math.max(num1, num2);
    }
    public int findLargest(int num1, int num2, int num3) {
       int large =  Math.max(num1, num2);
       return Math.max(large,num3);
    }
    public int findLargest(int num1, int num2, int num3, int num4) {
        int large1 =  Math.max(num1, num2);
        int large2 = Math.max(num3,num4);
        return Math.max(large1,large2);
    }
    public int findLargest(int num1, int num2, int num3, int num4, int num5) {
        int large1 =  Math.max(num1, num2);
        int large2 = Math.max(num3,num4);
        int large3 = Math.max(large1,large2);
        return Math.max(large3, num5);
    }
}
