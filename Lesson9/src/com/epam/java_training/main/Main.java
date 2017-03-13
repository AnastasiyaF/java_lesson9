/*
 * Задача 9.
 * Date: 12.03.2017
   Author: Anastasiya Findziukevich
   
Реализуйте самостоятельно динамическую структуру Односвязный список. 
Реализуйте методы добавления (в голову, хвост и произвольное место списка), 
удаления и поиска объекта в списке. Используйте параметризацию при описании класса. 
(Условие не означает необходимости повторить все возможности класса LinkedList. 
Возможности Java Collection Framework не использовать).
 * 
 * 
 */

package com.epam.java_training.main;

import com.epam.java_training.task.ParameterList;

public class Main {
	
	
	public static void testInteger(){
		ParameterList<Integer> list_1 = new ParameterList<Integer>();
		
		Integer element;
		
		System.out.println("Добавим элемент 2 в начало: ");
		
		element = 2;
		list_1.addFirstElement(element);
		
		System.out.println("Добавим элемент 3 в начало: ");
		element = 3;
		list_1.addFirstElement(element);
		
		
		System.out.println("Добавим элемент 5 в конец: ");
		element = 5;
		list_1.addLastElement(element);
		
		System.out.println(list_1);
		
		
		System.out.println("Добавим элемент 8 в конец: ");
		element = 8;
		list_1.addLastElement(element);
		
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("Добавим элемент 10 на 3 позицию: ");
		element = 10;
		list_1.add(3, element);
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("Добавим элемент 11 на 2 позицию: ");
		element = 11;
		list_1.add(2, element);
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("Добавим элемент 18 на 5 позицию: ");
		element = 18;
		list_1.add(5, element);
		
		System.out.println();
		System.out.println(list_1);
		
		
		System.out.print("Добавим элемент 11 на 29 позицию: ");
		element = 11;
		list_1.add(29, element);
		
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("Удалим элемент из начала списка: ");
		list_1.removeFirstElement();
		
		
		System.out.println("Удалим элемент из конца списка: ");
		list_1.removeLastElement();
		
		System.out.println();
		System.out.println(list_1);
		
		
		System.out.print("Удалим элемент с 3 индексом(4 элемент): ");
		list_1.remove(3);
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.print("Удалим элемент с 20 индексом(21 элемент): ");
		list_1.remove(20);
		
		element = 9;
		System.out.print("Проверим на существование элемента 9: ");
		if (list_1.contains(element)){
			System.out.println("Объект существует. ");
		}
		else{
			System.out.println("Объект не существует. ");
		}
		
	    element = 28;
		System.out.print("Проверим на существование элемента 28: ");
		if (list_1.contains(element)){
			System.out.println("Объект существует. ");
		}
		else{
			System.out.println("Объект не существует. ");
		}
		
		element = 18;
		System.out.print("Проверим на существование элемента 18: ");
		if (list_1.contains(element)){
			System.out.println("Объект существует. ");
		}
		else{
			System.out.println("Объект не существует. ");
		}
		
		element = 11;
		System.out.print("Проверим на существование элемента 11: ");
		if (list_1.contains(element)){
			System.out.println("Объект существует. ");
		}
		else{
			System.out.println("Объект не существует. ");
		}
		
		System.out.println();
		System.out.println(list_1);
	}
	
	public static void testString(){
		ParameterList<String> list_1 = new ParameterList<String>();
		
		String element;
		
		System.out.println("Добавим элемент str2 в начало: ");
		
		element = "str2";
		list_1.addFirstElement(element);
		
		System.out.println("Добавим элемент str3 в начало: ");
		element = "str3";
		list_1.addFirstElement(element);
		
		
		System.out.println("Добавим элемент str5 в конец: ");
		element = "str5";
		list_1.addLastElement(element);
		
		System.out.println(list_1);
		
		
		System.out.println("Добавим элемент str8 в конец: ");
		element = "str8";
		list_1.addLastElement(element);
		
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("Добавим элемент str10 на 3 позицию: ");
		element = "str10";
		list_1.add(3, element);
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("Добавим элемент str11 на 2 позицию: ");
		element = "str11";
		list_1.add(2, element);
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("Добавим элемент str18 на 5 позицию: ");
		element = "str18";
		list_1.add(5, element);
		
		System.out.println();
		System.out.println(list_1);
		
		
		System.out.print("Добавим элемент str11 на 29 позицию: ");
		element = "str11";
		list_1.add(29, element);
		
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.println("Удалим элемент из начала списка: ");
		list_1.removeFirstElement();
		
		
		System.out.println("Удалим элемент из конца списка: ");
		list_1.removeLastElement();
		
		System.out.println();
		System.out.println(list_1);
		
		
		System.out.print("Удалим элемент с 3 индексом(4 элемент): ");
		list_1.remove(3);
		
		System.out.println();
		System.out.println(list_1);
		
		System.out.print("Удалим элемент с 20 индексом(21 элемент): ");
		list_1.remove(20);
		
		element = "str9";
		System.out.print("Проверим на существование элемента str9: ");
		if (list_1.contains(element)){
			System.out.println("Объект существует. ");
		}
		else{
			System.out.println("Объект не существует. ");
		}
		
	    element = "str28";
		System.out.print("Проверим на существование элемента str28: ");
		if (list_1.contains(element)){
			System.out.println("Объект существует. ");
		}
		else{
			System.out.println("Объект не существует. ");
		}
		
		element = "str18";
		System.out.print("Проверим на существование элемента str18: ");
		if (list_1.contains(element)){
			System.out.println("Объект существует. ");
		}
		else{
			System.out.println("Объект не существует. ");
		}
		
		element = "str11";
		System.out.print("Проверим на существование элемента str11: ");
		if (list_1.contains(element)){
			System.out.println("Объект существует. ");
		}
		else{
			System.out.println("Объект не существует. ");
		}
		
		System.out.println();
		System.out.println(list_1);
	}
	
	public static void main(String[] args){
		
		
		System.out.println("Создадим пример с Integer");
		testInteger();
		
		System.out.println("Создадим пример со String");
		testString();
	    
	}

}
