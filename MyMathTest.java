class MyMath{
	long add(long a, long b) { // 매개변수 타입 써줌, 타입이 같아도 둘 다 써야함
		return a+b;
		// long result; return result;
		
	}
	long subtract(long a, long b) {return a - b;}
	long multiply(long a, long b) {return a*b;}
	
	double divide(double a, double b) {return a/b;}
}
class MyMathTest {
	public static void main(String[] args) {
	MyMath mm = new MyMath();
	long result1 = mm.add(5L, 3L); // long 타입 매개변수 집어넣음
	long result2 = mm.subtract(5L, 3L);
	long result3 = mm.multiply(5L, 3L);
	double result4 = mm.divide(5L, 3L);
	
	
	System.out.println("add(5L, 3L)= " + result1);
	System.out.println("substract(5L, 3L)= " + result2);
	System.out.println("multiply(5L, 3L)= " + result3);
	System.out.println("divide(5L, 3L)= " + result4);

}
}

