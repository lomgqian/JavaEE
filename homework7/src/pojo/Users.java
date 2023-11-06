package pojo;
import javax.validation.constraints.Pattern;

public class Users {
	@Pattern(regexp = "^[A-Za-z0-9]{1,15}$", message = "用户名可由大小写字符数字组成，用户名长度必须在1到15个字符之间") 
	private String uname;
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$,#_,@,*])[A-Za-z\\d$,#_,@,*]{1,15}$", message = "密码必须包含至少一个小写字母，一个大写字母，一个数字，和一个特殊字符,并且密码长度不能超过15个字符")  
	private String upwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

}
