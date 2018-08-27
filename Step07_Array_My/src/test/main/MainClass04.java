package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main method start");
		
		// int type을 담을 수 있는 방 5개짜리 배열 객체 생성해서
		// 참조값을 변수에 담기
		// 각각의 방에는 0이 들어 있다. (null 대신 0이 들어감.)
		// String[]과 다르게 int[]나 double[]는 배열 전체에 참조값이 생기며, 각방은 데이터가 들어감.
		int[] nums=new int[5];
		//0번방 참조해서 값 대입하기 
		nums[0]=10;			
		//1번방 참조해서 값 대입하기
		nums[1]=20;
		//2번방 참조해서 값 대입하기
		nums[2]=30;
		
		//방의 크기 참조하기
		int size=nums.length;
	}
}
