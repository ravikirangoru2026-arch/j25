package org.example.ds;

public class ClimbingStairs {
    static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
        //TC:O(n) & SC:O(1)d
    }

    static void main(String[] args) {
        //classic dynamic programming problem
        //You are climbing a staircase. It takes n steps to reach the top.
        //Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

//        System.out.println(climbStairs(1));
//        System.out.println(climbStairs(2));
//        System.out.println(climbStairs(3));
//       System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
//        System.out.println(climbStairs(6));


    }
}
