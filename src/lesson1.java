public class lesson1{
	
	public static double And(int min, int max) {
		int sum = 0;
//		int i = 0;
//		while(i<6) {
//			int temp = (int)(Math.random() * max) + min;
//			System.out.println("生成的temp為： " + temp);
//			sum += temp;
//			i++;
//		}
		for(int i=0;i<6;i++) {
			int temp = (int)(Math.random() * max) + min;
			System.out.println("生成的temp為： " + temp);
			sum += temp;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(And(2,32));
	}
}