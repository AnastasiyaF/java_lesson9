/*
 * ������ 9.
 * Date: 12.03.2017
   Author: Anastasiya Findziukevich
   
���������� �������������� ������������ ��������� ����������� ������. 
���������� ������ ���������� (� ������, ����� � ������������ ����� ������), 
�������� � ������ ������� � ������. ����������� �������������� ��� �������� ������. 
(������� �� �������� ������������� ��������� ��� ����������� ������ LinkedList. 
����������� Java Collection Framework �� ������������).
 * 
 * 
 */

package com.epam.java_training.main;

import com.epam.java_training.task.ParameterList;

public class Main {
	
	
	public static void testInteger(){
		ParameterList<Integer> list_1 = new ParameterList<Integer>();
		
		Integer element;
		
		System.out.println("������� ������� 2 � ������: ");
		
		element = 2;
		list_1.addFirstElement(element);
		
		System.out.println("������� ������� 3 � ������: ");
		element = 3;
		list_1.addFirstElement(element);
		
		
		System.out.println("������� ������� 5 � �����: ");
		element = 5;
		list_1.addLastElement(element);
		
		System.out.println(list_1);
		
		
		System.out.println("������� ������� 8 � �����: ");
		element = 8;
		list_1.addLastElement(element);
		
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("������� ������� 10 �� 3 �������: ");
		element = 10;
		list_1.add(3, element);
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("������� ������� 11 �� 2 �������: ");
		element = 11;
		list_1.add(2, element);
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("������� ������� 18 �� 5 �������: ");
		element = 18;
		list_1.add(5, element);
		
		System.out.println();
		System.out.println(list_1);
		
		
		System.out.print("������� ������� 11 �� 29 �������: ");
		element = 11;
		list_1.add(29, element);
		
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("������ ������� �� ������ ������: ");
		list_1.removeFirstElement();
		
		
		System.out.println("������ ������� �� ����� ������: ");
		list_1.removeLastElement();
		
		System.out.println();
		System.out.println(list_1);
		
		
		System.out.print("������ ������� � 3 ��������(4 �������): ");
		list_1.remove(3);
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.print("������ ������� � 20 ��������(21 �������): ");
		list_1.remove(20);
		
		element = 9;
		System.out.print("�������� �� ������������� �������� 9: ");
		if (list_1.contains(element)){
			System.out.println("������ ����������. ");
		}
		else{
			System.out.println("������ �� ����������. ");
		}
		
	    element = 28;
		System.out.print("�������� �� ������������� �������� 28: ");
		if (list_1.contains(element)){
			System.out.println("������ ����������. ");
		}
		else{
			System.out.println("������ �� ����������. ");
		}
		
		element = 18;
		System.out.print("�������� �� ������������� �������� 18: ");
		if (list_1.contains(element)){
			System.out.println("������ ����������. ");
		}
		else{
			System.out.println("������ �� ����������. ");
		}
		
		element = 11;
		System.out.print("�������� �� ������������� �������� 11: ");
		if (list_1.contains(element)){
			System.out.println("������ ����������. ");
		}
		else{
			System.out.println("������ �� ����������. ");
		}
		
		System.out.println();
		System.out.println(list_1);
	}
	
	public static void testString(){
		ParameterList<String> list_1 = new ParameterList<String>();
		
		String element;
		
		System.out.println("������� ������� str2 � ������: ");
		
		element = "str2";
		list_1.addFirstElement(element);
		
		System.out.println("������� ������� str3 � ������: ");
		element = "str3";
		list_1.addFirstElement(element);
		
		
		System.out.println("������� ������� str5 � �����: ");
		element = "str5";
		list_1.addLastElement(element);
		
		System.out.println(list_1);
		
		
		System.out.println("������� ������� str8 � �����: ");
		element = "str8";
		list_1.addLastElement(element);
		
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("������� ������� str10 �� 3 �������: ");
		element = "str10";
		list_1.add(3, element);
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("������� ������� str11 �� 2 �������: ");
		element = "str11";
		list_1.add(2, element);
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("������� ������� str18 �� 5 �������: ");
		element = "str18";
		list_1.add(5, element);
		
		System.out.println();
		System.out.println(list_1);
		
		
		System.out.print("������� ������� str11 �� 29 �������: ");
		element = "str11";
		list_1.add(29, element);
		
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("������ ������� �� ������ ������: ");
		list_1.removeFirstElement();
		
		
		System.out.println("������ ������� �� ����� ������: ");
		list_1.removeLastElement();
		
		System.out.println();
		System.out.println(list_1);
		
		
		System.out.print("������ ������� � 3 ��������(4 �������): ");
		list_1.remove(3);
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.print("������ ������� � 20 ��������(21 �������): ");
		list_1.remove(20);
		
		element = "str9";
		System.out.print("�������� �� ������������� �������� str9: ");
		if (list_1.contains(element)){
			System.out.println("������ ����������. ");
		}
		else{
			System.out.println("������ �� ����������. ");
		}
		
	    element = "str28";
		System.out.print("�������� �� ������������� �������� str28: ");
		if (list_1.contains(element)){
			System.out.println("������ ����������. ");
		}
		else{
			System.out.println("������ �� ����������. ");
		}
		
		element = "str18";
		System.out.print("�������� �� ������������� �������� str18: ");
		if (list_1.contains(element)){
			System.out.println("������ ����������. ");
		}
		else{
			System.out.println("������ �� ����������. ");
		}
		
		element = "str11";
		System.out.print("�������� �� ������������� �������� str11: ");
		if (list_1.contains(element)){
			System.out.println("������ ����������. ");
		}
		else{
			System.out.println("������ �� ����������. ");
		}
		
		System.out.println();
		System.out.println(list_1);
	}
	
	public static void main(String[] args){
		
		
		System.out.println("�������� ������ � Integer");
		testInteger();
		
		System.out.println("�������� ������ �� String");
		testString();
	    
	}

}
