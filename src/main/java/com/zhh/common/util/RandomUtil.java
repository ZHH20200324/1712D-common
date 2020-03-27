package com.zhh.common.util;

import java.util.HashSet;

/**
 * 	
 * @ClassName: RandomUtil 
 * @Description: ���������������
 * @author: lenovo
 * @date: 2020��3��26�� ����8:54:38
 */
public class RandomUtil {

	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
		int i=(int)(Math.random()*(max-min+1))+min;
		return i;

	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size()!=subs) {
			set.add(random(min,max));
			
			
		}
		int[] x = new int[subs];
		int i=0;
		for (Integer integer : set) {
			x[i]=integer;
			i++;
			
		}
		return x;
	
	}
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
		String str="1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		
		return str.charAt(random(0,str.length()-1));
	
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <length; i++) {
			sb.append(randomCharacter());
		}
		return sb.toString();
	
	}
}