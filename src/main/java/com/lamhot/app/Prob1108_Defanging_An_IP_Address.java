package com.lamhot.app;

public class Prob1108_Defanging_An_IP_Address {

	public String defangIPaddr(String address) {

		StringBuffer temp = new StringBuffer();
		for (char addr : address.toCharArray()) {
			if (addr == '.') {
				temp.append("[.]");
			} else {
				temp.append(addr);
			}
		}

		return temp.toString();
	}

}
