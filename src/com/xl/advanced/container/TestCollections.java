package com.xl.advanced.container;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-22
 * @description 测试Collections类的使用
 * @version 1.0
 */

public class TestCollections {
	public static void main(String[] args) {
		List lt = new LinkedList();
		for (int i=0; i<7; i++){
			lt.add("a" + i);
		}
		System.out.println(lt);
		Collections.shuffle(lt);	//乱序排列
		System.out.println(lt);
		Collections.sort(lt);	//默认升序，若要降序，则先Collections.sort()，再Collections.reverse()
		System.out.println(lt);
		Collections.reverse(lt);	//倒置
		System.out.println("倒置后：" + lt);
		System.out.println(Collections.binarySearch(lt, "a5"));
		Collections.sort(lt);
		System.out.println("重新排序后：" + lt);
		System.out.println(Collections.binarySearch(lt, "a5"));	//使用Collections.binarySearch()方法的前提是该容器已升序排序
	}
}

