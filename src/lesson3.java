import java.math.BigDecimal;
/*
 * ʵ�ִ������㣬����С��
 * */
public class lesson3 {

	public static BigDecimal div(double value1, double value2, int b) {
		if (b < 0)
			System.out.println("b��ֵ��횴��0");
		BigDecimal v1 = new BigDecimal(value1);
		BigDecimal v2 = new BigDecimal(value2);

//		return v1.divide(v2, b, BigDecimal.ROUND_HALF_UP); // ��������
//		return v1.divide(v2, b, BigDecimal.ROUND_UP); // ���һλ���֣���1��
//		return v1.divide(v2, b, BigDecimal.ROUND_DOWN); // ���һλ���֣���1��
		
		return v1.divide(v2, b, BigDecimal.ROUND_FLOOR);
	}

	public static void main(String[] args) {
		System.out.println(div(10, 3, 3));
	}
}
