package com.dp.gof.str.proxy;

public class MainProxyDemo {
    static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display(); //oading test.jpg \n Displaying test.jpg : lazy init

        image.display(); //Displaying test.jpg

    }
}
