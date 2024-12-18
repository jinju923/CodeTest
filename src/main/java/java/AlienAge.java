package java;

public class AlienAge {
	// a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 
	// 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.

	public String solution(int age) {
		
	String result = ""; //결과값 저장
	String ageStr = String.valueOf(age); //*valueOf : 숫자를 문자열로 변환
	
	for(int i=0; i<ageStr.length(); i++) {
		char digit = ageStr.charAt(i); //각 자리의 숫자를 가져오기
        result += (char) ('a' + (digit - '0')); // **알파벳으로 변환하여 추가
	}
	
	
	return result;

	}
	
	//* valueOf : 숫자를 문자열로 변환
	
	//** 각 자리 숫자를 어떻게 알파벳과 매칭할것인지?
	//	-> ASCII코드 사용
	//	'a'=97, 'b'=98, 'c'=99, 'd'=100 ...
	//	'0'=48, '1'=49, '2'=50, '3'=51 ...
	
	//	문자 '0'을 뺀 값은 실제 숫자를 나타낸다. 2살이라면?
	//	ex) '2' - '0' = 50-48 = 2
	//	=> 'a'에 숫자를 더하면 해당 알파벳이 나옴
	//	ex) 'a'(97) + 2 = 99 = 'c'
	
}
