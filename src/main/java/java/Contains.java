package java;

public class Contains {
	//문자열 str1, str2가 매개변수로 주어집니다.
	// str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

    public int solution(String str1, String str2) {
        if(str1.contains(str2)){
            return 1;
        } else {
            return 2;
        }
     
    }	
    
    //-------------------------------------------------------
    
    // indexOf는 특정 문자열이 다른 문자열에 포함되어 있는지 확인할 때 유용.
    // 포함된 경우 시작 인덱스를 반환, 포함되지 않으면 -1을 반환.
    
    public int solution2(String str1, String str2) {
        // indexOf를 사용하여 포함 여부 확인
        if (str1.indexOf(str2) != -1) {
            return 1;
        } else {
            return 2;
        }
    }
	
}
