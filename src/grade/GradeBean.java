package grade;

public class GradeBean {
	String id;
	
	// === 멤버필드영역(스코프) ===
	private int kor,eng,math,java; // 인스턴스 변수는 초기화를 하지 않는다
	private String name;
	
	public void setJava(int java){
		this.java = java;
	}
	public int getJava(){
		return java;
	}
	public void setKor(int kor){
		this.kor = kor;
	}
	public int getKor(){
		return kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public int getEng(){
		return eng;
	}
	public int setMath(int math){
		this.math = math;
		return math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	// === 멤버메소드 영역(스코프) ===
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	 
	@Override
	public String toString() {
		return "=== " + name + "("+id+") 의 성적표 ===\n" +
				"[kor=" + kor + ", eng=" + eng + ", math=" + math + ", java=" + java + "]";
	}
	
	
}






