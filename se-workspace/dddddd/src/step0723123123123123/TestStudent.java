package step0723123123123123;

public class TestStudent {

	public boolean solution(int[] arr) {

		boolean answer = true;

		int data = 0;
		int arrdata =0;
		/*
		for (int i = 0; i < arr.length; i++) { // 4,1,3,2
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					data = arr[i];
					arr[i] = arr[j];
					arr[j] = data;
				}
				
			}
			if (i+1 != arr[i]) return false;
				
		}*/
		
		for(int i=1;i<=arr.length;i++) {
			data +=i;
			arrdata+=arr[i-1];
			if(data == arrdata) {
				answer=true;
			}else {
				answer=false;
			}
		}
		

		return answer;
	}

	public static void main(String args[]) {
		TestStudent s = new TestStudent();
		boolean a = s.solution(new int[] { 1,2, 3 });
		System.out.println(a);

	}
}

//if (arr2 == null) {
//arr2 = arr;
//} else {
//
//for (int i = 0; i < arr2.length; i++) {
//	for (int j = 0; j < arr.length; j++) {
//		if (arr2[i] == arr[j]) {
//			answer = false;
//			if (answer == false)
//				arr2 = arr;
//			return answer;
//		}
//
//	}
//}
//}
