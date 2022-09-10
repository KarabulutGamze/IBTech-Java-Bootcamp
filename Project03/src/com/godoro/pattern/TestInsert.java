package com.godoro.pattern;

public class TestInsert {
	public static void main(String[] args) {

		try {
			ProductManager productManager=new ProductManager();
			Product product=new Product(0,"Buzdolabi",4350);
			boolean inserted=productManager.insert(product);
			
			if(inserted) {
				System.out.print("Ürün sokuldu.");
			}else {
				System.out.print("Sokulamadi.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}