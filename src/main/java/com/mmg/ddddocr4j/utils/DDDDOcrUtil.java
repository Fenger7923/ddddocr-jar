package com.mmg.ddddocr4j.utils;


import com.mmg.ddddocr4j.OCREngine;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

/**
 * DDDDOcr识别验证码工具类
 */
public class DDDDOcrUtil {
    private static final OCREngine ocrEngine = OCREngine.instance();

    /**
     * 获取识别的验证码
     *
     * @param base64 验证码base64字符串
     * @return
     */
    public static String getCode(String base64) {
        byte[] bytes = Base64.getDecoder().decode(base64);
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        try {
            BufferedImage bufferedImage = ImageIO.read(bis);
            return ocrEngine.recognize(bufferedImage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取识别的验证码
     *
     * @param inputStream 验证码图片输入流
     * @return
     */
    public static String getCode(InputStream inputStream) {
        try {
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            return ocrEngine.recognize(bufferedImage);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
