package com.dp.gof.str.bridge;

public class LowQualityTranscoder extends VideoTranscoder{
    public LowQualityTranscoder(VideoEncoder encoder) {
        super(encoder);
    }

    public void transcode(String filename)
    {
        System.out.print("Low Quality ");
        encoder.encode(filename);
    }
}
