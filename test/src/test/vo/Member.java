package test.vo;

public class Member {

	private String id;
	private String pw;
	private String pw2;
	private String birth;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	

	
public Member(String id, String pw, String birth) {
		super();
		this.id = id;
		this.pw = pw;
		this.birth = birth;
	}




public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getPw() {
		return pw;
	}




	public void setPw(String pw) {
		this.pw = pw;
	}




	public String getBirth() {
		return birth;
	}




	public void setBirth(String birth) {
		this.birth = birth;
	}




@Override
	public String toString() {
		// TODO Auto-generated method stub
	return " id :" + id+ ",   " + "비밀번호 :" + pw + "    생년월일" +  birth;
	}	
}