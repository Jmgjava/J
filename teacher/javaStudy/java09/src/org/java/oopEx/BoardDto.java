package org.java.oopEx;

import java.time.LocalDateTime;

public class BoardDto {

	private int no; // �۹�ȣ
	private String title;// ������
	private String content;// �۳���
	private String writer;// �ۼ���
	private String nickName;// �г���
	private int hit;// ��ȸ��
	// �ۼ��ð�,�����ð��� �ڵ����� spring���� ����
	private LocalDateTime creatTime = LocalDateTime.now();// �ۼ��ð�
	private LocalDateTime updateTime = LocalDateTime.now();// �����ð�

	// NoArgsContstruct -> �⺻������
	public BoardDto() {
		System.out.println("�⺻������");
	}

	// AllArgsContstruct -> ��� �ɹ�(�ʵ�)�� �Ű����ڷ� ������ ������
	public BoardDto(int no, String title, String content, String writer, String nickName, int hit,
			LocalDateTime creatTime, LocalDateTime updateTime) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.nickName = nickName;
		this.hit = hit;
		this.creatTime = creatTime;
		this.updateTime = updateTime;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public LocalDateTime getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(LocalDateTime creatTime) {
		this.creatTime = creatTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "BoardDto [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", nickName="
				+ nickName + ", hit=" + hit + ", creatTime=" + creatTime + ", updateTime=" + updateTime + "]";
	}

}
