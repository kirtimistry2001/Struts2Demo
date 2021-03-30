package ca.kirti.actions;

import com.opensymphony.xwork2.Action;

// implement aAction is not necessary
// Action have standard constant variable (e.g SUCCESS", LOGIN etc)
// instead you should use class
public class LoginAction implements Action{
	
	private String userId;
	private String password;
	//If we implements Action the this variable is available 
	//from Action interface
//	private static String SUCCESS = "success";
	
	
	public String execute() {
		System.out.println("received data fro ligin:" +getUserId() +", "
	+getPassword());
		if(getUserId().equals("userId") &&
				getPassword().equals("password")) {
			return SUCCESS;
		}else {
			System.out.println("return failure");
			return "faliure";
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
