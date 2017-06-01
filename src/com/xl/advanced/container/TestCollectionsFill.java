package com.xl.advanced.container;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-22
 * @description 
 * @version 1.0
 */

public class TestCollectionsFill {
	public static void main(String[] args) {
		List lt = new LinkedList();
		lt.add("111");
		lt.add("222");
		lt.add("333");
		
		System.out.println(lt);
		Collections.fill(lt, "888");
		System.out.println(lt);
	}

}

