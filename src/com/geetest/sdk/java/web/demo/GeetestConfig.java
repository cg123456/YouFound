package com.geetest.sdk.java.web.demo;

import org.springframework.stereotype.Component;

/**
 * GeetestWeb配置文件
 * 
 *
 */
public class GeetestConfig {

	// 填入自己的captcha_id和private_key
	/*private static final String captcha_id = "b46d1900d0a894591916ea94ea91bd2c";
	private static final String private_key = "36fc3fe98530eea08dfc6ce76e3d24c4";*/
	private static final String captcha_id = "cbf585f5997c91060c53d2207092c360";
	private static final String private_key = "d97bd2986e8ef6730956c244fa365cbd ";

	public static final String getCaptcha_id() {
		return captcha_id;
	}

	public static final String getPrivate_key() {
		return private_key;
	}

}
