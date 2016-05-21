package member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MemberServiceImpl implements MemberService {

	Map<String, MemberBean> map;
	MemberBean msession;
	
	public MemberServiceImpl() { 
		map = new HashMap<String, MemberBean>();
		msession = new MemberBean();
	}

	@Override
	public String join(MemberBean Bean) {
		String result = "회원가입 실패";
		if (!map.containsKey(Bean.getId())) {
			map.put(Bean.getId(), Bean);
			result = "회원가입 성공";
		}
		return result;
	}

	@Override
	public void upate(MemberBean Bean) {
		msession.setPwd(Bean.getPwd());
		map.put(msession.getId(), msession);
	}

	@Override
	public void delete() {
		map.remove(msession).getId();
	}

	@Override
	public MemberBean findById(String Id) {
		MemberBean m = null;
		if (map.containsKey(Id)) { 
			m = msession;
		}
		return m;
	}
 
	@Override
	public String login(String Id, String Pwd) {
		String result ="로그인 실패";
		if (map.containsKey(Id)) {
			if (Pwd.equals(map.get(Id).getPwd())) {
				msession = map.get(Id);
				result ="로그인 성공";
			}
		}
		return result;
	}

	@Override
	public List<MemberBean> findByName(String Name) {

	List<MemberBean> list = new ArrayList<MemberBean>();
	
	for (String key : map.keySet()) {
		if (Name.equals(map.get(key).getName())) {
			list.add(map.get(key));
		} 
	}
	
	/*
	Iterator<String> iterator = map.keySet().iterator();
	 
    while (iterator.hasNext()) {
        String key = (String) iterator.next(); 
        if (map.get(key).getName().equals(Name)) { 
            list.add(map.get(key));
		}
    } 
    */
	
	return list;
	}

	@Override
	public int countByGen(String Gen) {
		int count = 0;
		
		for (String key : map.keySet()) {
			if (Gen.equals(map.get(key).getGender())) {
				count++;
			} 
		}
		
		/*
		Iterator<String> iterator = map.keySet().iterator();
		
	    while (iterator.hasNext()) {
	        String key = (String) iterator.next();  
	        if (map.get(key).getGender().equals(Gen)) { 
	        	count++;
			}
	    } 
	    */
		return count; 
	}

	@Override
	public MemberBean detail() {
		// TODO Auto-generated method stub
		return msession;
	}
 

}
