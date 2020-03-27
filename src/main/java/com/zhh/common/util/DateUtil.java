package com.zhh.common.util;

import java.util.Date;


/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期处理类
 * @author: lenovo
 * @date: 2020年3月27日 上午8:56:38
 */
public class DateUtil {
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 随机产生一个随机日期
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate, Date endDate) {
		
		long t1 = startDate.getTime();//从1970到startDate的毫秒数
		long t2 = endDate.getTime();//从1970到endDate的毫秒数
		//随机产生一个在t1和t2中的毫秒数
		if(t2<t1)
			throw new RuntimeException("开始日期不能大于结束日期");
		long t=(long) (Math.random()*(t2-t1+1)+t1);
		
		
		return new Date(t);
	}
}
