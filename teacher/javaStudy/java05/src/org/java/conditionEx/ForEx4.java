package org.java.conditionEx;

public class ForEx4 {

	public static void main(String[] args) {
		System.out.println("for��");
		
		// ������ ����(���)�� ��ȸ
		// <img src="spring0.jpg" >
		// <img src="spring1.jpg" >
		// <img src="spring2.jpg" >
		// <img src="spring3.jpg" >
		// <img src="spring4.jpg" >
		
		System.out.println("<img src=\"spring0.jpg\" >");
		System.out.println("<img src=\"spring1.jpg\" >");
		System.out.println("<img src=\"spring2.jpg\" >");
		System.out.println("<img src=\"spring3.jpg\" >");
		System.out.println("<img src=\"spring4.jpg\" >");
		
		System.out.println();
		// for�� �̿��ؼ� ���-> ������ �ʴ� ���� ���ڿ�
		// for�� �̿��ؼ� ���-> ���ϴ� ����  ������ ����
		
		
		String html="<div class='shopList'> \n";
		html=html+"\t<ul> \n";	
		
		for(int i=0;i<100;i++) {
			System.out.println("<li><img src=\"spring"+i+".jpg\" ></li>");
			
			html=html+"\t\t<li><img src=\"spring"+i+".jpg\" ></li> \n";	
		}	
		
		 html=html+"\t</ul> \n";
		 html=html+"</div>";
		
		 System.out.println(html);
		
		
		
	}
}
