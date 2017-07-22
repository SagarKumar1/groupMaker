package pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class test {

    private String userId;

    private String password;
    
    public test(){}

    public test(String uId, String pwd){
      this.userId = uId;
      this.password = pwd;
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