package grade;

public interface GradeService {
	// 총점 구하기
			public int getTotal(GradeBean grade); // 추상메소드
			// 평균 구하기
			public int getAvg(GradeBean grade);
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
			public String getGrade(GradeBean grade);
}
