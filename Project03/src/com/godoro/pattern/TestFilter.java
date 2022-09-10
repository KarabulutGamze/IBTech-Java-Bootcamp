package com.godoro.pattern;

import java.util.List;

public class TestFilter {
	public static void main(String[] args) {

		try {
			ProductManager productManager=new ProductManager();
//			double salesPriceMin=5000;
//			List<Product> productList=productManager.listBySalesPriceGreater(salesPriceMin);
			
			String productNamePattern="Bil";
			List<Product> productList=productManager.listByProductNameLike(productNamePattern);
			
			for (Product product : productList) {
				System.out.println(product.getProductId()+" "
						+product.getProductName()+" "
						+product.getSalesPrice());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}