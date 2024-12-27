package java;

import java.util.Arrays;

	public class Mode {
	    public int solution(int[] array) {
	        // 배열을 정렬
	        Arrays.sort(array);
	        
	        // 최빈값을 찾기 위한 변수들
	        int maxCount = 0; // 최대 빈도수
	        int currentCount = 1; // 현재 빈도수
	        int mode = array[0]; // 최빈값 (초기값은 첫 번째 값)
	        int countOfMax = 1; // 최대 빈도수를 가진 숫자의 개수
	        
	        // 배열을 순차적으로 탐색
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] == array[i - 1]) {
	                currentCount++; // 같은 값이면 빈도수 증가
	            } else {
	                // 빈도수가 바뀌면, 이전 빈도수를 처리
	                if (currentCount > maxCount) {
	                    maxCount = currentCount; // 새로운 최대 빈도수 갱신
	                    mode = array[i - 1]; // 새로운 최빈값 갱신
	                    countOfMax = 1; // 새로운 최빈값을 가진 숫자 개수 초기화
	                } else if (currentCount == maxCount) {
	                    countOfMax++; // 최대 빈도수를 가진 숫자가 또 있으면 개수 증가
	                }
	                currentCount = 1; // 새로운 값으로 빈도수 초기화
	            }
	        }
	        
	        // 마지막 값 처리
	        if (currentCount > maxCount) {
	            mode = array[array.length - 1]; // 마지막 값이 최빈값
	        } else if (currentCount == maxCount) {
	            countOfMax++;
	        }
	        
	        // 최빈값이 여러 개일 경우 -1 반환
	        if (countOfMax > 1) {
	            return -1;
	        }
	        
	        return mode; // 최빈값 반환
	    }
	}



