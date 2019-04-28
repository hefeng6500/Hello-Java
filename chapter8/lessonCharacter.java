
public class lessonCharacter {
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Character s = new Character('a');
		Character a = new Character('a');
		Boolean bool = a.equals(s); // 只比较值
		System.out.println(bool);
		System.out.println( s == a); // 内存中的地址不一样
		
		Character s1 = Character.toUpperCase(s);
		Character a1 = Character.toUpperCase(a);
		Boolean bool2 = a.equals(s); // 只比较值
		System.out.println(bool2);
	}

}
