package learning.java.objects.collections;

import java.util.ArrayList;
import java.util.List;
//http://blog.csdn.net/itlwc/article/details/10148321#
public class ArrayListObject {
	public static void main1(String[] args) {
		List list = new ArrayList<Object>();
		// ���б��β��׷��ָ����Ԫ��
		list.add("lwc");
		// ���б��ָ��λ�ò���ָ��Ԫ��
		list.add(1, "nxj");
		// ׷��ָ�� collection �е�����Ԫ�ص����б�Ľ�β
		list.addAll(new ArrayList());
		// ���б����Ƴ�����Ԫ��
//		list.clear();
		// ����б����ָ����Ԫ��,�򷵻�true
		list.contains("nxj");
		// ����б����ָ�� collection ������Ԫ��,�򷵻� true
		list.containsAll(new ArrayList());
		// �Ƚ�ָ���Ķ������б��Ƿ����
		list.equals(new ArrayList());
		// �����б���ָ��λ�õ�Ԫ��
		list.get(0);
		// �����б�Ĺ�ϣ��ֵ
		list.hashCode();
		// �����б����״γ���ָ��Ԫ�ص�����,����б�������Ԫ��,�򷵻� -1
		list.indexOf("lwc");
		// �����б���������ָ��Ԫ�ص�����,����б�������Ԫ��,�򷵻� -1
		list.lastIndexOf("lwc");
		// ����б�����Ԫ��,�򷵻� true
		list.isEmpty();
		// �Ƴ��б���ָ��λ�õ�Ԫ��
		list.remove(0);
		// �Ƴ��б��г��ֵ��׸�ָ��Ԫ��
		list.remove("lwc");
		// ���б����Ƴ�ָ�� collection �а���������Ԫ��
		list.removeAll(new ArrayList());
		// ��ָ��Ԫ���滻�б���ָ��λ�õ�Ԫ��
		list.set(0, "lp");
		// �����б��е�Ԫ����
		list.size();
		// �����б���ָ����fromIndex(����)��toIndex(������)֮��Ĳ�����ͼ
		list.subList(1, 2);
		// ��������ȷ˳������б��е�����Ԫ�ص�����
		Object[] arr = list.toArray();
		for (Object a : arr) {
			System.out.println(a.toString());

		}
		// ���б�List�ĳ��ȴ��ڵ�������array�������б�����Ԫ�أ�
		//���б�list����С������array�򷵻��б�list�е�����Ԫ�أ��������ɵ�����newArray�ĳ��ȵ�������array�����㲿�ֲ�null
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