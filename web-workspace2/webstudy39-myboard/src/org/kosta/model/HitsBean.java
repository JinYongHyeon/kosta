package org.kosta.model;

import java.util.ArrayList;

public class HitsBean {
	
	private ArrayList<String> boardNo = new ArrayList<String>();
	
	public  ArrayList<String> getBoardNo(){
		return boardNo;
	}
	
	public int boardNoHitsCheck(String no) {
		int token = -1;
		for(int i=0;i<boardNo.size();i++) {
			if(boardNo.get(i).equals(no)) {
				token = 1;
				break;
			}
		}
		return token;
	}
	
	public void boardNoAdd(String no) {
		if(boardNoHitsCheck(no)!=1)
		boardNo.add(no);
	}
}
