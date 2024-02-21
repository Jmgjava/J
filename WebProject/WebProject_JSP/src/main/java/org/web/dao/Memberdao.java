package org.web.dao;

public class Memberdao {
	
	public Memberdao() {
		System.out.println("DAO");
	}
	
	private static class singleton {
		private static final Memberdao INSTANCE = new Memberdao();
	}
	
	public static Memberdao getInstance() {
		return singleton.INSTANCE;
	}
	
	

}
