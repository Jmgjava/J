package org.java.basicApi;

public class StringEx2 {

	public static void main(String[] args) {

		System.out.println("String");
		System.out.println("String �ֿ� �޼ҵ�");

		String s1 = "java";
		String s2 = "oracle";
		String s3 = "Java 2024 Project";
		// ���ڿ� ���� -> length() ������� ����
		System.out.println("���ڿ� ���� -> length() ������� ����");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());

		String userId = "m111";
		int size = userId.length(); // int�� ��ȯ
		System.out.println(size < 4); // int�� ��\
		if (size < 5) { // int�� if��
			System.out.println("5���� �̻� �Է��ϼ���");
		}

		System.out.println(s3);
		System.out.println(s3.charAt(6));
		System.out.println(s3.codePointAt(5));

		System.out.println("compareTo(���ڿ�) -> ����(���ڿ���)");
		System.out.println(s3.compareTo(s2)); // -1(����������)
		System.out.println("az".compareTo("za"));

		System.out.println("concat(String str), ���ڿ� ���ļ� -> ���ο� ���ڿ�");
		String addr1 = "�����";
		String addr2 = "�����";
		String addr3 = addr1.concat(" " + addr2); // ���ο� ���ڿ� addr3 ����
		System.out.println(addr3);
		System.out.println(addr2);
		System.out.println(addr1);

		String s31 = "Java 2024 Project";
		System.out.println(".contains(CharSequence s) -> ���ԵǾ� �ִ°�..?(�˻�)");
		System.out.println(s31.contains("j"));

		String s32 = "Java 2023 Project";
		System.out.println("replace(���ڿ�1, ���ڿ�2) -> ���ڿ�1 -> ���ڿ�2 �ٲ��");
		String s33 = s31.replace("2023", "2024"); // 2023 -> 2024
		System.out.println(s33);
		System.out.println(s32); // ���� ���ڿ��� ������ ����.

		System.out.println(".split() -> Ư����ȣ�� �и��ؼ� String �迭�� ����");
		String phone = "010-1234-5678";
		// -���� �����Ͽ� String �迭 ����
		String[] ph1 = phone.split("-"); // "-" �����Ͽ� ��Ʈ�� �迭�� ����
		System.out.println(ph1);
		// "010" "1234" "5678"
		System.out.println(ph1[0] + "," + ph1[1] + "," + ph1[2]);

		// 1. for�� �̿��ؼ� ���
		for (int i = 0; i < ph1.length; i++) {
			System.out.print(ph1[i] + "..");

		}

		System.out.println();

		// 2. for each�� �̿��ؼ� ���
//		for(��� Ÿ�� ���: ��ü(�迭)) {}
		for (String i : ph1) {
			System.out.println(i); // �迭�� ��� ��� ��ȸ
		}

		System.out.println("toLowerCase(), toUpperCase() -> �ҹ��ڷ� �ٲ��, �빮�ڷ� �ٲ��");
		String alpha = "JAVA";

		String alpha1 = alpha.toLowerCase();
		System.out.println(alpha1);

		String alpha2 = alpha1.toUpperCase();
		System.out.println(alpha2);

		System.out.println("trim() -> ���� ����");
		String passward = "  1 2 3 4  ";
		System.out.println(passward);
		System.out.println(passward.length() < 4);
		System.out.println(passward.trim());

	}

}
