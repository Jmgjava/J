package org.java.basicApi;

public class ClassEx {

	public static void main(String[] args) {

		System.out.println("Class");
		// 클래스 있는지 확인
		// 없으면 Exception(예외)를 발생 시킨다.
		// 있으면 정상실행
		// 반드시 예외처리를 해주어야한다.-> 자동으로 설정가능

		try {
			// 예외가 발생 할 가능성 있는 코드(명령문)
			// 찾는 클래스가 없으면 예외(무시 할 수 있는 에러)를 발생
			Class.forName("oracle.jdbc.driver.OracleDriver");	
//			Class.forName("org.java.basicApi.DateEx");	
			
			// 예외(무시할수 있는에러)가 발생이 되면 
		}catch(ClassNotFoundException e) {
			// 예외(무시 할 수 있는 에러-> 프로그램인 중단 없이) 내용 콘솔에 출력
			e.printStackTrace();
			System.out.println("드라이버NO");//개발자가 직접 설정
		}
		
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		System.out.println("프로그램 정상 종료");
		

		
	}
}
