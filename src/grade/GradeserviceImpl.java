package grade;

public class GradeserviceImpl implements GradeService {
	
	@Override
	public int getTotal(Gradebean grade) {
		int total = grade.getkor() + grade.geteng() + grade.getmath();
		return total;
	}
	@Override
	public String getAvg(Gradebean grade){
		String Result = "";
		int avg= grade.getkor() + grade.geteng() + grade.getmath()/3;

		switch(avg/10){	
			case 9:
				Result = "A";break;
			case 8:
				Result = "B";break;
			case 7:
				Result = "C";break;
			case 6:
				Result = "D";break;
			case 5:
				Result = "E";break;
			default :
				Result = "F";
			
		}	 
		return Result;
	}
	
	@Override
	public String getgrade(Gradebean grade) {
		String result = "";
		int avg= (grade.getkor() + grade.geteng() + grade.getmath()) / 3; 
		switch(avg/10){	 
			case 10: result = "A";break;
			case 9: result = "A";break;
			case 8: result = "B";break;
			case 7: result = "C";break;
			case 6: result = "D";break;
			case 5: result = "E";break;
			default : result = "F";
			
		}	 
		return result; 
	
	
	}
}
