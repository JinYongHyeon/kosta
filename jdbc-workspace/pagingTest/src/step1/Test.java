package step1;

public class Test {

	public static void main(String[] args) {
		
		int pageNo = 1;
		
		int rowIndex = 754;
		int rowIf = 10;
		int pageIf = 5;
		
		// rowMax = 
		int rowEnd = pageNo*rowIf;
		int rowStart = rowEnd-(rowIf-1); // 10 - 10-1 .... 30 - 10-1
		if(rowEnd>rowIndex) {
			rowEnd = rowIndex;
		}
		//�� ������ ����
		int pageEnd = rowIndex/pageIf+(rowIndex%pageIf>0?1:0); // 754/5 + 1
		if(pageNo>pageEnd) {
			pageNo = pageEnd;
		}
		
		int groupNo = pageNo/pageIf+(pageNo%pageIf>0?1:0); // 1/5 +  1 or 0
		int groupEnd = groupNo*pageIf; // 1 * 5 
		int groupStart  = groupEnd - (pageIf-1); // 5 - (5 - 1)
		
		int before = groupStart - pageIf; 
		int after = groupStart + pageIf; // 
		
		if(before<1) {
			before = 1;
		}
		if(after>pageEnd) {
			after =pageEnd/pageIf*pageIf+1; //76/5*5+1 
		}
		
		
				
	}

}