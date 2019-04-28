import java.math.BigDecimal;
/*
 * 实现大数运算，包括小数
 * */
public class lesson3 {

	public static BigDecimal div(double value1, double value2, int b) {
		if (b < 0)
			System.out.println("b的值必須大於0");
		BigDecimal v1 = new BigDecimal(value1);
		BigDecimal v2 = new BigDecimal(value2);

//		return v1.divide(v2, b, BigDecimal.ROUND_HALF_UP); // 四舍五入
//		return v1.divide(v2, b, BigDecimal.ROUND_UP); // 最后一位数字，进1法
//		return v1.divide(v2, b, BigDecimal.ROUND_DOWN); // 最后一位数字，进1法
		
		return v1.divide(v2, b, BigDecimal.ROUND_FLOOR);
	}

	public static void main(String[] args) {
		System.out.println(div(10, 3, 3));
	}
}
