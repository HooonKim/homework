package homework;

import java.util.Scanner;

public class Kaup {
	public String getResult(String name, double weight,double height){
		String result = "";

		Scanner scanner = new Scanner(System.in);  
		
		/* 데이터 입력 */
		System.out.println("이름,키,몸무게 입력");
		name = scanner.next();
		height = scanner.nextDouble();
		weight = scanner.nextDouble();
		
		double biman; 
		String bimancase;
		/* 연산 */
		
		biman =  (weight / (height*height)) * 10000;
		
		
		
		if (24 <= biman) {
			bimancase = "과체중";
		} else if (20 <= biman) {
			bimancase = "정상";
		} else if (20 <= biman) {
			bimancase = "저체중";
		} else if (20 <= biman) {
			bimancase = "마름";
		} else if (20 <= biman) {
			bimancase = "영양실조";
		} else {
			bimancase = "소모증";
		}
			 
		result = name + "님의 비만도는 " + (int)biman + "이므로 " +  bimancase + "입니다.";
		
		return result;
	}
}
