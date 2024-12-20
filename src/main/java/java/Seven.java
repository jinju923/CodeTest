package java;

public class Seven {
	//정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
	
	
    public int solution(int[] array) {
        int answer = 0;
        
        //* 배열을 순회하며 각 숫자를 확인
        for (int num : array) {
        	
            // 숫자를 문자열로 변환
            String strNum = String.valueOf(num);
            
            for (int i = 0; i < strNum.length(); i++) {
                if (strNum.charAt(i) == '7') { //** 문자열에 '7'이 있는지 확인
                    answer++;
                }
            }
        }
        return answer;
    }	
    
    //------------------------------------------------------
    
    //* 배열의 각 요소를 문자열로 바꾸려면  for (int num : array)을 사용해야함
    //	array 배열의 각 요소를 num이라는 변수에 순차적으로 대입.
    
    //** charAt(i)를 통해 각 인덱스 문자를 확인

}
