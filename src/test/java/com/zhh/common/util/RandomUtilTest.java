package com.zhh.common.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {
	
	@Test//返回一个随机整数
	public void randomTest() {
		
		System.out.println(RandomUtil.random(8, 3));
	}
	
	@Test//返回一个随机整数数组
	public void subRandom() {
		int[] x=RandomUtil.subRandom(1, 10, 3);
	
		for (int i : x) {
			System.out.println(i);
		}
	}
	
	@Test//返回一个随机字符
	public void randomCharacter() {
		
		
		System.out.println(RandomUtil.randomCharacter());
	}
	
	@Test//返回一个指定长度的字符串
	public void randomString() {
		
		System.out.println(RandomUtil.randomString(5));
	}

}
