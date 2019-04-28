import java.text.DecimalFormat;

public class lesson2 {
	
	public static String format(String pattern, double value) {
		DecimalFormat myFormat = new DecimalFormat(pattern);
		String num = myFormat.format(value);
		return num;
	}

	public static String AreaFun(double r) {
		double area = Math.PI * Math.pow(r, 2);
		
		String str = format("#.#####", area);
		
		return str;
	}

	public static void main(String[] args) {
		System.out.println(AreaFun(5.6));
	}
}