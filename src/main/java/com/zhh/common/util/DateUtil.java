package com.zhh.common.util;

import java.util.Date;


/**
 * 
 * @ClassName: DateUtil 
 * @Description: ���ڴ�����
 * @author: lenovo
 * @date: 2020��3��27�� ����8:56:38
 */
public class DateUtil {
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: �������һ���������
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate, Date endDate) {
		
		long t1 = startDate.getTime();//��1970��startDate�ĺ�����
		long t2 = endDate.getTime();//��1970��endDate�ĺ�����
		//�������һ����t1��t2�еĺ�����
		if(t2<t1)
			throw new RuntimeException("��ʼ���ڲ��ܴ��ڽ�������");
		long t=(long) (Math.random()*(t2-t1+1)+t1);
		
		
		return new Date(t);
	}
}
