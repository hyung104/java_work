package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main method start");
		//int type을 저장하고 있는 배열	- 각방 참조데이터 타입
		int[] nums= {10,20,30,40,50};
		// 0번방 참조
		int a=nums[0];
		//1번방 참조
		int b=nums[1];
		//방의 크기 참조
		int size=nums.length;
	}
}
