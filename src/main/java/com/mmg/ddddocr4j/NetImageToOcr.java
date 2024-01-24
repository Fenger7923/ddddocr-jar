package com.mmg.ddddocr4j;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

public class NetImageToOcr {

	public static String downloadImage(String imageUrl) throws IOException {
        @SuppressWarnings("deprecation")
		URL url = new URL(imageUrl);
        InputStream inputStream = url.openStream();
        BufferedImage image = ImageIO.read(inputStream);
        inputStream.close();
        
        OCREngine engine = OCREngine.instance();
        String predict = engine.recognize(image);
        return predict;
    }
}