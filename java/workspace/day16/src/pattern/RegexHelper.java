package pattern;

import java.util.regex.Pattern;

public class RegexHelper {
	/*
	 * 1. 싱글톤
	 * 2. boolean isValue(String str)	, str : 검사할 문자열, 공백, null체크
	 * 3. boolean isNum(String str)		, str : 검사할 문자열, 숫자형식 검증
	 * 4. boolean isEng(String str)		, str : 검사할 문자열, 영문인지 검증체크  
	 * 5. boolean isKor(String str)		, str : 검사할 문자열, 한글인지 검증체크  
	 * 6. boolean isEngNum(String str)	, str : 검사할 문자열, 영문/숫자 인지 검증체크  
	 * 7. boolean isKorNum(String str)	, str : 검사할 문자열, 한글/숫자 인지 검증체크  
	 * 8. boolean isEmail(String str)	, str : 검사할 문자열, email 인지 검증체크  
	 * 9. boolean isCellPhone(String str), str : 검사할 문자열, 휴대전화번호 인지 검증체크
	 * ---------------------------------------------------------------------------------  
	 */
	
	// 싱글톤 객체 준비
	private static RegexHelper current;
	
	public static RegexHelper getInstance() {
		if(current == null) {
			current = new RegexHelper();
		}
		return current;
	}
	
	public static void freeInstance() {
		current = null;
	}
	
	private RegexHelper() {}
		
	// ---------------------------------------------------------
	
	// 공백, null체크
	/*
	 * 주어진 문자열이 공백이거나 null인지를 검사
	 * @param 	str		: 검사할 문자열
	 * @return 	boolean : 공백, null이 아닐 경우 true 리턴
	 */

	public boolean isValue(String str) {
		boolean result = false;
		
		if (str != null) {
			result = !str.trim().equals("");
		}
		
		return result;
	}
	
	// 숫자형식 검증
	/*
	 * 숫자 모양에 대한 형식 검사
	 * @param 	str		: 검사할 문자열
	 * @return 	boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	
	public boolean isNum(String str) {
		boolean result = false;
		
		if (isValue(str)) {
			result = Pattern.matches("^[0-9]*$", str);
		}
		
		return result;
	}
	
	// 영문인지 검증체크
	/*
	 * 영문으로만 구성되어있는지에 대한 형식 검사
	 * @param 	str		: 검사할 문자열
	 * @return 	boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	public boolean isEng(String str) {
		boolean result = false;
		
		if (isValue(str)) {
			result = Pattern.matches("^[a-zA-Z]*$", str);
		}
		
		return result;
	}
	
	// 한글인지 검증체크  
	/*
	 * 한글로만 구성되어있는지에 대한 형식 검사
	 * @param 	str		: 검사할 문자열
	 * @return 	boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	public boolean isKor(String str) {
		boolean result = false;
		
		if (isValue(str)) {
			result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
		}
		
		return result;
	}
	
	// 영문/숫자 인지 검증체크
	/*
	 * 영문과 숫자로만 구성되어있는지에 대한 형식 검사
	 * @param 	str		: 검사할 문자열
	 * @return 	boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	public boolean isEngNum(String str) {
		boolean result = false;
		
		if (isValue(str)) {
			result = Pattern.matches("^[a-zA-Z0-9]*$", str);
		}
		
		return result;
	}
	
	// 한글/숫자 인지 검증체크 
	/*
	 * 한글과 숫자로만 구성되어있는지에 대한 형식 검사
	 * @param 	str		: 검사할 문자열
	 * @return 	boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	public boolean isKorNum(String str) {
		boolean result = false;
		
		if (isValue(str)) {
			result = Pattern.matches("^[ㄱ-ㅎ가-힣0-9]*$", str);
		}
		
		return result;
	}
	
	// email 인지 검증체크  
	/*
	 * 이메일 형식으로 구성되어있는지에 대한 형식 검사
	 * @param 	str		: 검사할 문자열
	 * @return 	boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	public boolean isEmail(String str) {
		boolean result = false;
		
		if (isValue(str)) {
			result = Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", str);
		}
		
		return result;
		
	}
	
	// 휴대전화번호 인지 검증체크
	/*
	 * 휴대전화번호 형식으로 구성되어있는지에 대한 형식 검사
	 * @param 	str		: 검사할 문자열
	 * @return 	boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	public boolean isCellPhone(String str) {
		boolean result = false;
		
		if (isValue(str)) {
			result = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", str);
		}
		
		return result;
	}
	
	
}
