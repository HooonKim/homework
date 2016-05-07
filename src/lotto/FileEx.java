package lotto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		// C:\Users\USER
		try {
			File file = new File("C:\\Users\\USER\\test\\lotto.txt");
			FileWriter writer = new FileWriter(file, true);
			while(true) {
				System.out.println("[메뉴]  1.전송 2.읽기 0.종료"); 
				switch (scanner.nextInt()) {
				case 1:	writer.write(scanner.next());
						writer.flush();
						writer.close();break;
				case 2: break; 
				case 0: System.out.println("종료합니다.");return;

				default:
					break;
				}
			}
		} catch (IOException e) {
			// 에러가 발생하면
			e.printStackTrace();
		} //
		
	}
}
