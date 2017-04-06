package learning.java.objects.collections;

import java.util.ArrayList;
import java.util.List;
//http://blog.csdn.net/itlwc/article/details/10148321#
public class ArrayListObject {
	public static void main1(String[] args) {
		List list = new ArrayList<Object>();
		// 向列表的尾部追加指定的元素
		list.add("lwc");
		// 在列表的指定位置插入指定元素
		list.add(1, "nxj");
		// 追加指定 collection 中的所有元素到此列表的结尾
		list.addAll(new ArrayList());
		// 从列表中移除所有元素
//		list.clear();
		// 如果列表包含指定的元素,则返回true
		list.contains("nxj");
		// 如果列表包含指定 collection 的所有元素,则返回 true
		list.containsAll(new ArrayList());
		// 比较指定的对象与列表是否相等
		list.equals(new ArrayList());
		// 返回列表中指定位置的元素
		list.get(0);
		// 返回列表的哈希码值
		list.hashCode();
		// 返回列表中首次出现指定元素的索引,如果列表不包含此元素,则返回 -1
		list.indexOf("lwc");
		// 返回列表中最后出现指定元素的索引,如果列表不包含此元素,则返回 -1
		list.lastIndexOf("lwc");
		// 如果列表不包含元素,则返回 true
		list.isEmpty();
		// 移除列表中指定位置的元素
		list.remove(0);
		// 移除列表中出现的首个指定元素
		list.remove("lwc");
		// 从列表中移除指定 collection 中包含的所有元素
		list.removeAll(new ArrayList());
		// 用指定元素替换列表中指定位置的元素
		list.set(0, "lp");
		// 返回列表中的元素数
		list.size();
		// 返回列表中指定的fromIndex(包括)和toIndex(不包括)之间的部分视图
		list.subList(1, 2);
		// 返回以正确顺序包含列表中的所有元素的数组
		Object[] arr = list.toArray();
		for (Object a : arr) {
			System.out.println(a.toString());

		}
		// 若列表List的长度大于等于数组array，返回列表所有元素，
		//若列表list长度小于数组array则返回列表list中的所有元素，且新生成的数组newArray的长度等于数组array，不足部分补null
		String[] array=new String[] { "a", "b" };
 		Object[] newArray=list.toArray(array);
	}
	
	
	public static void main(String[] args){
		
		
		ArrayList<String> a =new ArrayList<String>();
		a.add("d");
//		a.add("b");
//		a.add("c");
//		a.add("e");
//		a.add("d");
//		a.add("f");
//		a.add("g");
//		a.add("h");
		String[] strarray=new String[] { "a", "b" };
	String[] str=	a.toArray(strarray);
	
	for(String s:str){
	 
		System.out.println(s);
	}
	   str[1]="x";
	for(String s:str){
		System.out.println(s);
	}
	}
}