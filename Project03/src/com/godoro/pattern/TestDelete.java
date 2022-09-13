package com.godoro.pattern;

public class TestDelete {
	
public static void main(String[] args) {
		
		try {
		ProductManager productManager = new ProductManager();
		Product product = new Product(4, "Mikser", 450);
		boolean updated = productManager.update(product);
		if(updated) {
			System.out.println("Silindi");
			
		} else {
			System.out.println("Silinemedi");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
