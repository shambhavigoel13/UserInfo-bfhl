package com.bfhl.info.response;

import lombok.Data;

@Data
public class InfoResponse {
	boolean is_success;
	String user_id;
	String email;
	String roll_number;
	String[] numbers;
	String[] alphabets;
	public boolean isIs_success() {
		return is_success;
	}
	public void setIs_success(boolean is_success) {
		this.is_success = is_success;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(String roll_number) {
		this.roll_number = roll_number;
	}
	public String[] getNumbers() {
		return numbers;
	}
	public void setNumbers(String[] numbers) {
		this.numbers = numbers;
	}
	public String[] getAlphabets() {
		return alphabets;
	}
	public void setAlphabets(String[] alphabets) {
		this.alphabets = alphabets;
	}
	
	
}
