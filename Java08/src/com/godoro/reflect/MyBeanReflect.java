package com.godoro.reflect;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class MyBeanReflect {
	public static void main(String[] args) {
		
	
	Class<?> clazz=Class.forName("com.godoro.source.MyBean");
	Constructor<?> constructor=clazz.getConstructor();
	
	List<String> propertyNames=new ArrayList<>();
	for(Method method : clazz.getDeclaredMethods()) {
		if(method.getName().startsWith("get") && method.getParameterCount()==0){
			String sub=method.getName().substring(3);
			String property=Character.toLowerCase(sub.charAt(0))+sub.substring(1);
			System.out.println(property);
		}
	}	
	
	for(Field field : clazz.getFields()) {
		System.out.println(field.getName()+" "+field.);
	}

	for(Method method : clazz.getDeclaredMethods()) {
		if(method.getName().startsWith("get") && method.getParameterCount()==0){
			String sub=method.getName().substring(3);
			String property=Character.toLowerCase(sub.charAt(0))+sub.substring(1);
			System.out.println(property+" ");
			String set="set"+sub;
			Class<?> parameterTypes[] = {method.getReturnType()};
			Method setter=clazz.getMethod(set, parameterTypes);
			System.out.println(setter.getName());
		}
		System.out.println();
	}
}
}