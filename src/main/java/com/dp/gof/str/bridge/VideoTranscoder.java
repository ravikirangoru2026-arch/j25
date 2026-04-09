package com.dp.gof.str.bridge;

public abstract class VideoTranscoder {
    protected VideoEncoder encoder;

    public VideoTranscoder(VideoEncoder encoder) {
        this.encoder = encoder;
    }
    public abstract void transcode(String filename);
}
