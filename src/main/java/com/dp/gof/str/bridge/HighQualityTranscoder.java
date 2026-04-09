package com.dp.gof.str.bridge;

public class HighQualityTranscoder extends VideoTranscoder {
    public HighQualityTranscoder(VideoEncoder encoder) {
        super(encoder);
    }

    public void transcode(String filename) {
        System.out.print("High Quality ");
        encoder.encode(filename);
    }
}
