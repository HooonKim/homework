package member;

import java.util.List;

public interface MemberService {
	//CRUD
	//add, find, update, delete
	public String join(MemberBean Bean);
	public void upate(MemberBean Bean);
	public void delete();
	public MemberBean detail();
	public String login(String Id, String Pwd);
	public MemberBean findById(String Id);
	public List<MemberBean> findByName(String Name);
	public int countByGen(String Gen);
	
	
}
