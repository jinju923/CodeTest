package java;

import java.util.Arrays;

public class Triangle {
	//선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
	//가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
	//삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 
	//세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.

    public int solution(int[] sides) {
               
        //세변의 길이 순서대로 배열
        for (int i=0; i<sides.length-1; i++){
            if(sides[i] > sides[i+1]){
                int temp = sides[i];
                sides[i] = sides[i+1];
                sides[i+1] = temp;
            } 
        };

        
        //가장 긴 변 < 나머지 변의 합        
        if(sides[0]+sides[1] > sides[2]){
            return 1;
        } else {
            return 2;
        }
    
    }
    
    //------------------------------------------------------
    
    //이 문제에서는 가장 긴 변이 마지막에 오면 되기 때문에 [1]과 [2]의 순서가 상관이 없지만
    //만약 길이 순으로 배열을 하려면 이중for문을 사용해야함
    
    public int solution2(int[] sides) {
        
        //세변의 길이 순서대로 배열
        for (int i = 0; i < sides.length - 1; i++) {
            for (int j = 0; j < sides.length - 1 - i; j++) {
                if (sides[j] > sides[j + 1]) {
                    // 값 교환
                    int temp = sides[j];
                    sides[j] = sides[j + 1];
                    sides[j + 1] = temp;
                }
            }
        }

        
        //가장 긴 변 < 나머지 변의 합        
        if(sides[0]+sides[1] > sides[2]){
            return 1;
        } else {
            return 2;
        }
    
    }
    
    //------------------------------------------------------
    
    // java에서는 Arrays.sort(); 를 사용하면 오름차순 정렬됨.
    
    public int solution3(int[] sides) {
        
        // 배열을 오름차순 정렬
        Arrays.sort(sides);

        // 가장 긴 변 < 나머지 두 변의 합인지 확인
        if (sides[0] + sides[1] > sides[2]) {
            return 1; // 삼각형을 만들 수 있음
        } else {
            return 2; // 삼각형을 만들 수 없음
        }
    }


}
