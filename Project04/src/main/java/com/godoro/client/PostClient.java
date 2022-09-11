package com.godoro.client;

import static com.godoro.utils.StreamUtilities.*;

import com.godoro.utils.StreamUtilities;

public class PostClient {
	public static void main(String[] args) throws Exception {
		String address = "http://localhost:8080/Project04/me";
		String input = StreamUtilities.post(address,"Giden");
		System.out.println("Girdi: ");
		System.out.println(input);
	}


}
