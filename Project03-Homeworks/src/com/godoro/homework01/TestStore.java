package com.godoro.homework01;

import java.util.ArrayList;
import java.util.List;

public class TestStore {

	public static void main(String[] args) {
		
		try {
			List<Supplier> customerList=new ArrayList<>();
			customerList.add(new Supplier(601,"Cem Karaca",6540));
			customerList.add(new Supplier(602,"Baris Manco",7645));
			customerList.add(new Supplier(603,"Fikret Kizilok",3450));

			String filePath="C:\\Users\\karab\\Ibtech\\Supplier.txt";
			CustomerFiler customerFiler=new CustomerFiler(filePath);
			customerFiler.store(customerList);
			
		}catch(Exception e){
			
			e.printStackTrace();
		}

	}
}
