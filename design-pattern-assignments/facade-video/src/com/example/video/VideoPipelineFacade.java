package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    private final Decoder decoder;
    private final Encoder encoder;
    private final FilterEngine filterEngine;
    

    public VideoPipelineFacade(Decoder decoder, Encoder encoder, FilterEngine filterEngine) {
        this.decoder = decoder;
        this.encoder = encoder;
        this.filterEngine = filterEngine;
    }

    public Path process(Path inFile, Path outFile) {
        Frame[] frames = decoder.decode(inFile);
        frames = filterEngine.grayscale(frames);
        frames = filterEngine.scale(frames, 0.5);
        Path out = encoder.encode(frames, outFile);
        return out;
    }
        
    
}