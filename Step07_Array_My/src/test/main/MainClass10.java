package test.main;

public class MainClass10 {
	public static void main(String[] args) {
		// java의 기본 반복문
		for(int i=0; i<10; i++) {
			System.out.println("i :"+i);			
		}
		
		int[] nums= {10, 20, 30, 40, 50};
		for(int i=0; i<nums.length; i++) {
			int tmp=nums[i];		// for문 안의 변수는 for문이  한번 수행될때마다 생성되고,for문의 끝에 오면 삭제됨이 반복됨. 
			System.out.println("tmp :"+tmp);			
		}
	}
}
