public class Red_Orange {
	public static void main(String[] args) {
		String s1 = "Red is Favorite color.";
		String s2 = "Orange is also my Favorite color.";

		String startStr = "Red";

		boolean starts1 = s1.startsWith(startStr);
		boolean starts2 = s2.startsWith(startStr);

		System.out.println("String s1 : " + s1 + "\n	starts with " + startStr + " ? = " + starts1);
		System.out.println("String s1 : " + s2 + "\n	starts with " + startStr + " ? = " + starts2);
	}
}