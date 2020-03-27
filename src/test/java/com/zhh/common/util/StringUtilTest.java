package com.zhh.common.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		//String str=null;没
		//String str="4";有
		//String str="";没
		String str=" ";//有
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		//String str = "";//没
		//	String str = "";//没
			String str = " ";//没
			boolean b = StringUtil.hasText(str);
			System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(50);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}

}
