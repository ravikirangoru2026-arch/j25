package com.dp.gof.str.bridge;

public class MPEGEncoder implements VideoEncoder{
    @Override
    public void encode(String filename) {
        System.out.println("Encoding " + filename + " to MPEG format");
    }
}
