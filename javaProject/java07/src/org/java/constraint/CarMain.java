package org.java.constraint;

public class CarMain {

	public static void main(String[] args) {
		// ����, ���� �Ұ� -> static final �ۼ�**
		System.out.println("���۳⵵: " + CarCommon.CARYEAR);
		System.out.println("�ڵ�����: " + CarCommon.CARNAME);
		System.out.println("��ⷮ: " + CarCommon.CARWEIGHT);
		System.out.println("���ۻ�: " + CarCommon.PJNAME);
		
		//����
		CarEn cn1 = new CarEn();
		cn1.enName = "en1";
		cn1.enWeight = 100;
		cn1.enCoin = 20000;
		// ����Ʈ
		CarB cb1 = new CarB();
		cb1.bName = "cb1";
		cb1.bwidth = 200;
		cb1.bCoin = 18000;
		// ��
		CarD cd1 = new CarD();
		cd1.dName = "cd1";
		cd1.dweight = 170;
		cd1.dCoin = 30000;
		// ����
		CarH ch1 = new CarH();
		ch1.hName = "ch1";
		ch1.hWidth = 110;
		ch1.hCoin = 12000;
		
		System.out.println("���� ���: "+cn1.enName+","+cn1.enWeight+","+cn1.enCoin);
		System.out.println("���� ���: "+cb1.bName+","+cb1.bwidth+","+cb1.bCoin);
		System.out.println("���� ���: "+ch1.hName+","+ch1.hWidth+","+ch1.hCoin);
		System.out.println("���� ���: "+cd1.dName+","+cd1.dweight+","+cd1.dCoin);

	}
}
