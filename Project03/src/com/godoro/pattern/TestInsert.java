package com.godoro.pattern;

public class TestInsert {
	
	public static void main(String[] args) {
		
		try {
		ProductManager productManager = new ProductManager();
		Product product = new Product(0, "Buzdolabı", 4350);
		boolean inserted = productManager.update(product);
		if(inserted) {
			System.out.println("Ürün sokuldu.");
			
		} else {
			System.out.println("Sokulamadı");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

