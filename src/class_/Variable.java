package class_;

public class Variable {
	static int b; // 필드
	static double c;
	int d;
	
	public static void main(String[] args) {
		// 지역변수 (local Variable)
		short a = 65; //0000 0000 0100 0001 16bit
		int b = 65; // 
		
		System.out.println("지역변수 a = " + a);
		System.out.println("지역변수 b = " + b);
		
		System.out.println("필드 b = " + Variable.b);
		System.out.println("필드 c = " + c);
		/* System.out.println("필드 d = " + new Variable().d); */
		Variable v = new Variable(); // 생성
		System.out.println("객체 v = "+ v);
		System.out.println("필드 d = " + v.d);
	}
}
