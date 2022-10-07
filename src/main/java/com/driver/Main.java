package com.driver;

class Product{

    public int product(int x, int y) {
        return 0 ;
    }
    public int product(int x, int y, int z) {

        return 0;
    }
    public double product(double x, double y) {

        return 1.0;
    }


}

public class Main {



    public static void main(String args[])
    {
        Product p = new Product();
        p.product(10,15);
        p.product(10,15,20);
        p.product(10.02,10.6);
    }

}