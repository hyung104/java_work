package test.main;
/*
 * [ 기본 data type 의 참조  data type ] : 기본데이터 타입을 객체형으로 포장해서 사용함.
 * 
 * - 때로는 기본 data type 을 참조 data type 에 포장(wrap)해서 사용해야 할 때가 있다.
 * - 그럴때 사용하는 클래스가 Wrapper class이다.
 * - new 안하고 바로 대입해서 사용 가능. auto wrap(자동포장)
 * byte		: Byte
 * short	: Short
 * int		: Integer
 * long		: Long
 * 
 * float 	: Float
 * double	: Double
 * 
 * boolean	: Boolean
 * 
 * char		: Character
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main method start");
		// 기본 data type 변수 num1
		int num1=10;
		// 참조 data type 변수 num2
		Integer num2=20;		// id값(참조값 갖고있음). new Integer() 안함. 자동포장됨.
		
		// 자유롭게 산술연산 가능
		int result=num1+num2;
		int result2=num1*num2;
		Integer result3=num2/num1;
		
		System.out.println("result :"+result);
		System.out.println("result2 :"+result2);	
		System.out.println("result3 :"+result3);
	}
}
