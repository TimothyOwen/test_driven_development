package tdd;

import java.util.ArrayList;

public class Email {
	ArrayList<String> emailList = new ArrayList<String>();
	public Email() {
		this.populateList();
	}
	public void populateList() {
		emailList.add("firstName.surname@qa.com");
		emailList.add("firstNameSurname@gmail.com");
	}
	public boolean isValidEmail(String email) {
		if(emailList.contains(email)) {
			return true;
		}else {
			return false;
		}
	}
}
