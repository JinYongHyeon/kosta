package step1;

import java.util.ArrayList;
import java.util.HashMap;

public class KakaoCrane {
	public static int a(int[][] board,int[] moves) {
		int answer =0;
		ArrayList<Integer> bang = new ArrayList<Integer>();
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		for(int i=0;i<board.length;i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=0;j<board.length;j++){
				if(board[j][i]!=0) 
				list.add(board[j][i]);
			}
			map.put(i,list);
		
		}
		
		for(int m =0; m<moves.length;m++) {
			if(!map.get(moves[m]-1).isEmpty()) {
			bang.add(map.get(moves[m]-1).get(0));
			map.get(moves[m]-1).remove(0);
			}
		}
		System.out.println(bang);
		for(int j=0;j<bang.size()-1;j++) {
			if(bang.get(j) == bang.get(j+1)) {
				bang.remove(j);
				bang.remove(j);
				j=j-2;
				if(j<0) j=-1;
				answer = answer+2;
			}	
		}
		System.out.println(bang);
 		return answer;
	}
	public static void main(String[] args) {
		//int a[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		//int b[] = {1,5,3,5,1,2,1,4};
		int a[][] = {{0,0,1,0,0},{0,0,1,0,0},{0,2,1,0,0},{0,2,1,0,0}};
		int b[] = {1,2,3,3,2,3,1};
		int sum = a(a,b);
		System.out.println(sum);
	}

}
