
public class lessonCharacter {
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Character s = new Character('a');
		Character a = new Character('a');
		Boolean bool = a.equals(s); // ֻ�Ƚ�ֵ
		System.out.println(bool);
		System.out.println( s == a); // �ڴ��еĵ�ַ��һ��
		
		Character s1 = Character.toUpperCase(s);
		Character a1 = Character.toUpperCase(a);
		Boolean bool2 = a.equals(s); // ֻ�Ƚ�ֵ
		System.out.println(bool2);
	}

}
