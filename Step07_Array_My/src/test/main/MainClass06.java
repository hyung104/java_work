package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		// int type 을 담을 수 있는 방 5개짜리 배열 객체 생성
		//int[] nums=new int[5];			// 각각의 방 초기값 0, 값 할당되도 id값 생성안됨. prmitive type이므로
		int[] nums= {0, 0, 0, 0, 0};
		
		// double type을 담을 수 있는 방 5개짜리 배열 객체 생성
		//double[] nums2=new double[5];	// 각각의 방 초기값 0.0, 값 할당되도 id값 생성안됨. prmitive type이므로
		double[] nums2= {0.0, 0.0, 0.0, 0.0, 0.0};

		// String type을 담을 수 있는 방 5개짜리 배열 객체 생성
		//String[] msgs=new String[5];	// 각각의 방 초기값 null, 값 할당되면 각방마다 id값 생김.
		String[] msgs= {null, null, null, null, null};
	}
}
