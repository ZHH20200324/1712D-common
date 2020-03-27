package com.zhh.common.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {
	
	@Test//����һ���������
	public void randomTest() {
		
		System.out.println(RandomUtil.random(8, 3));
	}
	
	@Test//����һ�������������
	public void subRandom() {
		int[] x=RandomUtil.subRandom(1, 10, 3);
	
		for (int i : x) {
			System.out.println(i);
		}
	}
	
	@Test//����һ������ַ�
	public void randomCharacter() {
		
		
		System.out.println(RandomUtil.randomCharacter());
	}
	
	@Test//����һ��ָ�����ȵ��ַ���
	public void randomString() {
		
		System.out.println(RandomUtil.randomString(5));
	}

}
