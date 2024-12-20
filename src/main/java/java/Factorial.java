package java;

public class Factorial {
	//i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 
	//예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
	//i! ≤ n
	
    public int solution(int n) {
        
        int i=0;
        int result=1;
        
        while(result <= n){ //*
            i++;
            result *= i;
        }
        
        return i-1;
    }
    
    //* 1부터 값을 증가하며 곱한 값을 result에 저장
    //	값이 n보다 커지면 while문 종료

}
