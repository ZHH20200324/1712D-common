package com.zhh.common.util;

import java.util.ArrayList;
import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void isEmptyTest() {
		ArrayList<Object> list = new ArrayList<Object>();
		//list.add(1);
		boolean b = CollectionUtil.isEmpty(list);
		System.out.println(b);
	}

}
