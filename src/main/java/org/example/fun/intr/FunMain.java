package org.example.fun.intr;

public class FunMain {
    public static void main(String[] args) {

        TwoIntegerAdditable.details();

        AddTwoInts obj = new AddTwoInts();
        obj.desc();
        System.out.println("Add 10,20 = " + obj.add(10, 20));



        TwoIntegerAdditable obj1 = (i, j) -> {
            return i + j;
        };

        System.out.println("Add 10,20 = " + obj1.add(10, 20));


        TwoIntegerAdditable obj2 = Integer::sum;
        System.out.println("Add 10,20 = " + obj2.add(10, 20));



        ThreeIntegerAdditable<Integer> t1= (i,j,k)->{ return i+j+k;};
        System.out.println("Add 10, 20, 30 = "+t1.add(10, 20 ,30));
    }
}
