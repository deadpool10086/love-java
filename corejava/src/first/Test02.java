package first;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("10+5=" + (10 + 5));
		System.out.println("10-5=" + (10 - 5));
		System.out.println("10*5=" + 10 * 5);
		System.out.println("10/3=" + 10.0 / 3);
		System.out.println("10/3=" + Math.floor(10.0 / 3));
		System.out.println("3.75四舍五入=" + Math.round(3.75));
		System.out.println(" |-10|" + Math.abs(-10));
		System.out.println("3^4=" + Math.pow(3, 4));
		System.out.println("120的平方根等于" + Math.sqrt(120));
		System.out.println("3.75保留一位小数:" + Math.round(3.75 * 10) / 10.0);
	}

}
