package betterString;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "Hello";
		String string2 = "World1";
		String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
		String first = StringUtils.betterString(string1, string2, (s1, s2) -> true );

		System.out.println("the longer string is : "+longer);
		System.out.println("the better string is the first string is : "+first);

	}

}
