package com.fs.test;

public class ArrayDemo {

	//������Ϊ����ʱ
	public void m1(int a[]){
		System.out.println("����ĳ����ǣ�"+a.length);
	}
	
	//������Ϊһ������ֵ
	public String[] m2(){
		//����һ�����鲢��������
//		String s[]={"abc","abc","abc"};
//		return s;
		//����һ������ֱ�ӷ���
		return new String[]{"abc","a"};
	//����һ��Ŭ����ֵ������������鲻����
		//return null;
	}
	
	
	public static void main(String[] args) {
		ArrayDemo ad= new ArrayDemo();
//		//����һ�����鴫��������������
//		int a[]={1,2,3,4};
//		ad.m1(a);
//		//ֱ�Ӵ������鴫ֵ
//		ad.m1(new int[]{1,2,3});
//		//����һ��nullֵ������������鲻����
//		ad.m1(null);//int a[]=null
		String[] s = ad.m2();
		System.out.println("���յ������鳤��Ϊ��"+s.length);
	}

}

