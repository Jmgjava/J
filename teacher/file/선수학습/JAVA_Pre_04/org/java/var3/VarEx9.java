package org.java.var3;

public class VarEx9 {

	public static void main(String[] args) {
		System.out.println("형변환");
		
		byte b=127;// -2^7~+2^7-1 (-128~+127)
		System.out.println(b);
		
		// -128~+127  
		//-> 최대값위의 범위로 벗어나는(커지는) 경우->오버플로워
		//-> 최소값아래의 범위로 벗어나는(작아지는) 경우-> 언더플로워
		
		b=(byte)(b+1);// 127+1	-> 127보다 1크면 최소값(-128)로 변환	
		System.out.println(b);
		
		b=(byte)129;// 127+1+1	-> 127보다 2크면 -127로 변환	
		System.out.println(b);
		
		
		b=(byte)-128;
		System.out.println(b);
		
		b=(byte)-129;// -128-1 -> -128보다 1작으면 최댓값(+127) 변환
		System.out.println(b);
				
		b=(byte)-130;// -128-1-1 ->-128보다 2작으면 +126 변환
		System.out.println(b);
		
		// 문자열+정수(실수) -> 문자열+문자열-> 문자열
		// 정수+정수+문자열  -> 앞의 두항 먼저 연산 수행 1.(정+정),2.새정+문자열,3.문자열
		
		System.out.println("100"+100);// "100"+"100"-> "100100"
		System.out.println(100+100+"100");//200+"100"->"200100"
		System.out.println(100+"100"+100+100);//"100100"+100+100
		System.out.println(100+"100"+(100+100));//"100100"+200-> "100100200"
		
		System.out.println("==========================");
		
		System.out.println(1.5+1.4);
		double b4= 1.5+1.4;
		System.out.println((int)1.5+1.4);
		double b5=(int)1.5+1.4;
		System.out.println(1.5+(int)1.4);
		double b6=1.5+(int)1.4;
		
		System.out.println((int)1.5+(int)1.4);
		int i4=(int)1.5+(int)1.4;		
		System.out.println(i4);
		double d7=(int)1.5+(int)1.4; //doble=int+int -> double
		System.out.println(d7);
		int i5= (int)1.5+(int)1.4;// int=int+int -> int
		
		
		int sum=55+100+63;
		System.out.println(sum);
		
//		int avg=sum/3;
		double avg=(double)sum/3;
		System.out.println(avg);
		
		
	}
}
