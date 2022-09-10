package com.godoro.pattern;

public class TestDelete {
	public static void main(String[] args) {

		try {
			ProductManager productManager=new ProductManager();
			long productId=5;
			boolean deleted=productManager.delete(productId);
			
			if(deleted) {
				System.out.print("Ürün silindi.");
			}else {
				System.out.print("Silinemedi");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
