package java;

public class Reverse {
	//문자열 my_string이 매개변수로 주어집니다. 
	// my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
	
	class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	        for(int i=my_string.length() -1; i>=0; i--){
	            answer += my_string.charAt(i); //문자열의 특정 인덱스의 문자를 추출
	        }
	        return answer;
	    }
	}

}
