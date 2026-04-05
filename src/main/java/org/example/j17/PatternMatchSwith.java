package org.example.j17;

public class PatternMatchSwith {

    public static String getDataOld(int n)
    {
        String data=null;
        switch (n)
        {
            case 1: data= "One";
            break;
            case 2: data= "Two";
            break;
            case 3: data = "three";
            break;
            default:
                data ="Invalid";
                break;
        }
        return data;
    }

    static String getData12(int n)
    {
        String data=switch (n)
        {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "Invalid";
        };
        return data;
    }
    static void main(String[] args) {
        System.out.println("Old way: "+getDataOld(3));
        System.out.println("j12 way: "+getData12(3));

    }
}
