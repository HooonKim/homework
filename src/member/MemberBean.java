package member;

public class MemberBean {
	private String id;
	private String pwd;
	private String name;
	private String gender; //남자:m 여자:w
	
	public MemberBean(){ 
	}
	
	public MemberBean(String id, String name, String pwd, String gender){
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.gender = gender;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "회원정보 [ID=" + id + ", pwd=" + pwd + ", 이름=" + name + ", 성별=" + gender + "]";
	}
	
    
}
