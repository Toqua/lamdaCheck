package betterString;

import java.util.function.BiPredicate;

public class StringUtils {
	public static String betterString(String f,String s,BiPredicate<String,String>p){
		if(p.test(f, s))
		return f;
		else return s;
		
	}

}
