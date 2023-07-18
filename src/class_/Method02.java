package class_;

public class Method02 {

	public static void main(String[] args) {
		Method02 m = new Method02();
		
		int s1 = m.sum(25,36);//호출
		System.out.println("합 = "+ s1);
		
		int s2 = m.sub(25,36);//호출
		System.out.println("차 = "+ s2);
		
		int s3 = m.mul(25,36);//호출
		System.out.println("곱 = "+ s3);
		
		double s4 = m.div(25,36);//호출
		//System.out.println("몫 = "+ s4); //0.6944444444444444
		System.out.println("몫 = "+ String.format("%5.3f", s4));
		//0.694 %다섯 공간 중 3자리만 원한다 "%5.3f" , %크기는 알빠가 아니라 3자리만 원한다f "%0.3f"
		
	}
	
	public int sum(int x, int y) {//구현
		return x+y;
	}
	public int sub(int x, int y) {//구현
		return x-y;
	}
	public int mul(int x, int y) {//구현
		return x*y;
	}

	/*
	 * public double div(double x, double y) {//구현 return x/y; }
	 */
	public double div(int x, int y) {//구현
		return (double)x/y; //강제 형 변환 (cast연산)
	}
	
}
