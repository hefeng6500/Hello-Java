
public class lessonIntrger {
	
	public static int change(int value) {
		Integer num = new Integer(value);
		
		int newNum = (int)num;
		return newNum;
	}
	public static void main(String[] args) {
		System.out.println(change(1));
	}

}
