package com.mmg.ddddocr4j;

import java.io.IOException;;

public class Main {

	public static void main(String[] args) throws IOException {
	    String predict = NetImageToOcr.downloadImage("http://119.36.213.60/Validate/GetValidateCode");
        System.out.println("读出的验证码结果为:" + predict);
	}

}
