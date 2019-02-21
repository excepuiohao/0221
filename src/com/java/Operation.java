package com.java;

/**
 * @author excepuio 
 * ����java����� ���η�
 */
public class Operation {

	// volatile ��ζ��number_1ÿ�λ�ȡ����ȥ��ԭ�ȵĵ�ַ �����������д����Ż�
	public volatile int number_1 = 3;

	public static int number_2 = 3;

	// transient��ζ��number_3�����л�ʱĬ�ϲ��������л�
	public transient int number_3 = 5;

	/**
	 * ����ǰ׺ ��׺����
	 */
	public void testPlusOperation() {
		int result = number_1 * ++number_1;
		System.out.println("++ǰ׺��number_1: " + number_1 + " result: " + result);
		result = number_2 * number_2++;
		System.out.println("��׺++��number_2: " + number_2 + " result: " + result);
	}

	/**
	 * ����λ�����
	 */
	public void testBitOperation() {
		int number = 2;
		number = number << 2;
		System.out.println("����2������3ΪΪ��" + number);
	}

	/**
	 * ������������� ����Ԫ�������
	 */
	public void testConditionalOperator() {
		int number = 2;
		number = (3 >= 4) ? 3 : 4;
		System.out.println("�����������number��ֵ��" + number);
	}


	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

}
