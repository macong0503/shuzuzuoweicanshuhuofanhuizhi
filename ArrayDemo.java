package com.fs.test;

public class ArrayDemo {

	//数组作为参数时
	public void m1(int a[]){
		System.out.println("数组的长度是："+a.length);
	}
	
	//数组作为一个返回值
	public String[] m2(){
		//创建一个数组并返回引用
//		String s[]={"abc","abc","abc"};
//		return s;
		//创建一个数组直接返回
		return new String[]{"abc","a"};
	//返回一个努力了值，但是这个数组不可用
		//return null;
	}
	
	
	public static void main(String[] args) {
		ArrayDemo ad= new ArrayDemo();
//		//创建一个数组传递这个数组的引用
//		int a[]={1,2,3,4};
//		ad.m1(a);
//		//直接创建数组传值
//		ad.m1(new int[]{1,2,3});
//		//传递一个null值，但是这个数组不可用
//		ad.m1(null);//int a[]=null
		String[] s = ad.m2();
		System.out.println("接收到的数组长度为："+s.length);
	}

}

