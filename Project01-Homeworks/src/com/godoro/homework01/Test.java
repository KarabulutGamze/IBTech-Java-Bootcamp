package com.godoro.homework01;

public class Test {
	
   public static void main(String[] args) {
        
        Employee employee=new Employee(201,"Erkan", "Ocaklı",5470);
	    employee.setEmailAddress("erkan@godoro.com");
        
        sendMail(employee);
    }
    
    private static void sendMail(Person person) {
	System.out.println();
	System.out.println("Kime: "+person.getEmailAddress());
	System.out.println("Konu: "+person.getGreetings());
	System.out.println("Gövde: "+person.getFullName());
	}

}
