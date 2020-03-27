package com.zhh.common.util;

import java.util.Collection;
import java.util.List;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: 判断是否有内容
 * @author: lenovo
 * @date: 2020年3月26日 下午8:16:38
 */
public class CollectionUtil {

	public static boolean isEmpty(Collection<?> collection) {
		
		return collection==null || collection.isEmpty();
	}
}
