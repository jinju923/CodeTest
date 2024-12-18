package java;

public class EachPlus {
	//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
	// -> 각 자릿수 더하기
	
    public int solution(int n) {
        int answer = 0;
        while(n>0){
            answer+=n%10;
            n=n/10;
            
        }
        return answer;
    }
    
    
    //-------------------------------------
    public int solution2(int n) {
        int answer = 0;
        while(n>0){
            answer=n%10;
            n=n/10;
            answer+=answer;
            //이렇게 생각했는데 위에서 구한 answer를 중복으로 더하기 때문에 틀림
            // ex) n=123일때,
            // answer = 123%10 = 3
            // n = 123/10 = 12
            // answer = answer+answer = 3+3 =6
            // 결국엔 6이 나오기 때문에 틀림!
        }
        return answer;
    }
    

}
