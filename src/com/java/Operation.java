package com.java;

/**
 * @author excepuio 
 * 测试java运算符 修饰符
 */
public class Operation {

	// volatile 意味着number_1每次获取都会去找原先的地址 编译器不进行代码优化
	public volatile int number_1 = 3;

	public static int number_2 = 3;

	// transient意味着number_3在序列化时默认不进行序列化
	public transient int number_3 = 5;

	/**
	 * 测试前缀 后缀自增
	 */
	public void testPlusOperation() {
		int result = number_1 * ++number_1;
		System.out.println("++前缀：number_1: " + number_1 + " result: " + result);
		result = number_2 * number_2++;
		System.out.println("后缀++：number_2: " + number_2 + " result: " + result);
	}

	/**
	 * 测试位运算符
	 */
	public void testBitOperation() {
		int number = 2;
		number = number << 2;
		System.out.println("数字2向右移3为为：" + number);
	}

	/**
	 * 测试条件运算符 （三元运算符）
	 */
	public void testConditionalOperator() {
		int number = 2;
		number = (3 >= 4) ? 3 : 4;
		System.out.println("条件运算符后number的值：" + number);
	}


	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

}
