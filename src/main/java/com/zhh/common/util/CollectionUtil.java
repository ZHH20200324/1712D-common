package com.zhh.common.util;

import java.util.Collection;
import java.util.List;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: �ж��Ƿ�������
 * @author: lenovo
 * @date: 2020��3��26�� ����8:16:38
 */
public class CollectionUtil {

	public static boolean isEmpty(Collection<?> collection) {
		
		return collection==null || collection.isEmpty();
	}
}
