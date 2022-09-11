package com.godoro.homework01;

import java.io.IOException;
import java.util.List;

public class TestLoad {
	public static void main(String[] args) throws IOException {
		
		try {

			String filePath = "C:\\Users\\karab\\Ibtech\\Supplier.txt";
			CustomerFiler customerFiler = new CustomerFiler(filePath);
			List<Customer> CustomerList = CustomerFiler.load();

			for (Customer customer : CustomerList) {
				System.out.println(customer.getCustomerId() + " " + customer.getCustomerName() + " " + customer.getTotalDebit());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
