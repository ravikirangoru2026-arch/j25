package com.dp.gof.str.bridge;

public class MainBridgeDemo {
    static void main(String[] args) {
        // 4 combinations without 4 classes!
        VideoTranscoder t1= new HighQualityTranscoder(new MPEGEncoder());
        t1.transcode("video1.mp4");

        VideoTranscoder t2= new LowQualityTranscoder(new VP8Encoder());
        t2.transcode("video2.mp4");

    }
}
