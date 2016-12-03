package first;

public class Test05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("3.758保留两位小数");
		System.out.println(pround(3.758, 2));

	}
	public static double pround(double valuse,int index)
	{
		double pow10 = Math.pow(10, index);
		double result = valuse*pow10;
		result = Math.round(result);
		result /= pow10;
		return result;
	}

}
