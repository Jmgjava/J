package org.java.oopEx;

public class CarMain {

	public static void main(String[] args) {
		// ����, ���� �Ұ� -> static final�� �ۼ�
		System.out.println("���ۻ�: " + CarCommon.PRNAME);
		System.out.println("���۳⵵: " + CarCommon.CARYEAR);
		System.out.println("�ڵ�����: " + CarCommon.CARNAME);
		System.out.println("����߷�: " + CarCommon.CARWEIGHT);

		// �ڵ���1
		// ����
		CarEn cn1 = new CarEn();
		cn1.enName = "en1";
		cn1.enWeight = 100;
		cn1.enCoin = 20000;
		// ����
		CarB cb1 = new CarB();
		cb1.bName = "cb1";
		cb1.bWeight = 200;
		cb1.bCoin = 100000;
		// ��
		CarD cd1 = new CarD();
		cd1.dName = "cd1";
		cd1.dWeight = 50;
		cd1.dCoin = 100;
		// ��
		CarH ch1 = new CarH();
		ch1.hName = "ch1";
		ch1.hWidth = 200;
		ch1.hCoin = 10000;

		System.out.println("���� ���: �̸�:" + cn1.enName + ",�߷�:" + cn1.enWeight + ",����:" + cn1.enCoin);
		System.out.println("���� ���: �̸�:" + cb1.bName + ",�߷�:" + cb1.bWeight + ",����:" + cb1.bCoin);
		System.out.println("���� ���: �̸�:" + cd1.dName + ",�߷�:" + cd1.dWeight + ",����:" + cd1.dCoin);
		System.out.println("���� ���: �̸�:" + ch1.hName + ",�߷�:" + ch1.hWidth + ",����:" + ch1.hCoin);

	}
}
