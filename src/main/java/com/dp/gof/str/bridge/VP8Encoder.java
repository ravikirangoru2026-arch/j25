package com.dp.gof.str.bridge;

public class VP8Encoder implements VideoEncoder {
    @Override
    public void encode(String filename) {
        System.out.println("Encoding " + filename + " to VP8 format");
    }
}
