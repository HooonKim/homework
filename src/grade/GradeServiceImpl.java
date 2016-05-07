package grade;

public class GradeServiceImpl implements GradeService{
	// 총점 구하기
	@Override	
	public int getTotal(GradeBean grade){
			int total=grade.getKor()+grade.getEng()+grade.getMath()+grade.getJava();
			return total;
		}
		// 평균 구하기
	@Override
	public int getAvg(GradeBean grade){
		int avg=(getTotal(grade))/3;
		return avg;
	}
		// 학점 구하기 : getGrade
		/*
		평균점수가 
		90 이상 A
		80 이상 B
		70 이상 C
		60 이상 D
		50 이상 E
		50 미만 F 학점입니다.
		
		 * */
	@Override
	public String getGrade(GradeBean grade){
		String result = "";
		// 알고리즘
		switch (((getTotal(grade))/3)/10) {
		case 10:result = "A"; break;
		case 9:result = "A";break;
		case 8:result = "B";break;
		case 7:result = "C";break;
		case 6:result = "D";break;
		case 5:result = "E";break;
		default:
			result = "F";break;
		}
		return result;
	}
		
}
