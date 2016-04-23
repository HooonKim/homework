package grade;

public interface GradeService {

	public int getTotal(Gradebean grade); //추상메소드

	public String getAvg(Gradebean grade);
	
	public String getgrade(Gradebean grade);
}
