package cracking_the_coding_interview;

public class URLify
{
	static final int TRUE_LENGTH = 13;
	static final char[] STRING = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ',  ' ', ' ', ' ',  ' ', ' ', ' ',  ' ', ' ', ' ',  ' ', ' ', ' ',  ' ', ' ', ' ',  ' ', ' ', ' '};
	
	
	public static void main (String[] args) throws java.lang.Exception {
		System.out.println(URLify(STRING));
	}
	static char[] URLify(char[] str) {
		int index = TRUE_LENGTH - 1;
		int spaces = 0;
		for (int i = 0; i < index; i++){
			if (str[i] == ' ')
				spaces++;
		}
		int newIndex = index + (2 * spaces);
		str[newIndex + 1] = '\0';
		for (int i = index; i >= 0; i--){
			System.out.println(str);
			if (str[i] == ' '){
				str[newIndex--] = '0';
				str[newIndex--] = '2';
				str[newIndex--] = '%';
			} else 
				str[newIndex--] = str[i];
		}
		return str;
	}
}
