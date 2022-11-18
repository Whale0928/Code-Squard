# Code-Squard
과제 찾아서 풀어보기


## Level 2
### 코드스쿼드의 레벨 2 문제를 해결해보았다.
https://deadwhale.notion.site/Level2-68cf30ba733f444ba5b9cb5e306c5b3f

>10/13
- 과제에서 요구하는 모든 기능을 구현해 보았다.
>10/16
- 기능을 인터페이스와 구현체로 분리
>10/17
- 오류를 해결하고 구현 완료
- 코드의 길이 / 뎁스 확인 필요

-----
Computer  - 컴퓨터가 수행해야하는 기능의 인터페이스
  -    int[] makeAnswer();
    - 정답을 생성하는 메소드
  -    Map<String, Integer> checking(int[] answer , int[]swing);
    - 입력받은 배열과 답을 비교해 결과를 반환하는 메서드
  -    boolean chkResult(Map<String,Integer> map);
    - 결과를 출력하고 반복할지 끈낼지 반환하는 메서드
    
User    - 사용자가 해야하는 동작의 인터페이스
  -   int[] inputNumbers() throws InputMismatchException;
    - 입력받은 값을 전달하는 메서드
  -   int[] strToArray(String n);
    - 파라미터로 전달받은 문자열을 배열로 반환하는 메서드
    
    
공통 사항 
-  입력시 정수 아닐 경우네는 Pasing 시 발생하는 NumberFormetException으로 던져버린다
-  입력 값의 길이가 3이 아닐 경우에 에러 생성.  에러 의미상 inputMisMatch으로 구현했다.

-----

## Level 3
### 코드스쿼드의 레벨 3 문제를 해결해보았다.
- 기능 구현 보다 볼링 점수 계산 방식을 공부하는게 더 어려웠다.


 