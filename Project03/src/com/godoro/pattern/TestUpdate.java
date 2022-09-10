package com.godoro.pattern;

public class TestUpdate {
	public static void main(String[] args) {

		try {
			ProductManager productManager=new ProductManager();
			Product product=new Product(4,"Mikser",450);
			boolean updated=productManager.update(product);
			
			if(updated) {
				System.out.print("Ürün güncellendi.");
			}else {
				System.out.print("Güncellenemedi!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}