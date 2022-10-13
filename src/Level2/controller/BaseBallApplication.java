package Level2.controller;

/**
 * 구현 제약사항
 * 함수(또는 메소드) 하나의 크기가 최대 10라인을 넘지 않도록 구현한다.
 * 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.
 * indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
 * 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
 * 전역 변수를 사용하지 않는다.
 */

import java.util.*;

/**
 * [예] 상대방의 수가 425일 때,
 * 123을 제시한 경우 : 1 스트라이크
 * 456을 제시한 경우 : 1 스트라이크 1볼
 * 789를 제시한 경우 : 낫싱
 */

public class BaseBallApplication {

    /**
     * 프로세스의 시작을 담당하는 main 클래스.
     *
     * @param args
     */
    public static void main(String[] args) {


        System.out.println("Welcome!!");
        System.out.println("숫자 야구를 시작합니다.!!");

        //랜덤한 답을 만든다.
        List<Integer> answer = new LinkedList<>();
        List<Integer> deck = new LinkedList<>();
        for (int i = 1; i < 10; i++) deck.add(i);
        Collections.shuffle(deck);
        for (int i = 0; i < 3; i++) answer.add(deck.get(i));

while (true) {

        //입력을 받는다.
        int[] swing = new int[3];
        Scanner sc = null;
        while (true) {

            try {
                /**문제 발생 !!!
                 * error: 스캐너 객체 생성 후 값을 입력 받은 후
                 *        객체 초기화를 진행 하지 않아서 무한 Exception이 발생했다.
                 * solution : 객체를 반복시 생성하는 방식으로 변경
                 */

                sc = new Scanner(System.in);
                System.out.print("숫자를 입력해주세요 : ");
                int temp = sc.nextInt();
                if (temp > 999) {
                    throw new InputMismatchException();
                }

                //배열에 집어넣는 건데 메서드화 해야 한다.
                for (int i = 0; i < 3; i++) swing[i] = Integer.parseInt(String.valueOf((String.valueOf(temp).charAt(i))));

                break;
            } catch (InputMismatchException e) {
                System.out.println("3자리 정수만 입력해주세요");
            }

        }


        System.out.println(answer);
        System.out.println(Arrays.toString(swing));

        //동일한 값이 1개 이상 있?는 경우.

            //동일한 값이 1개 이상 있?는 경우.
            Map<String,Integer> result  = new HashMap<>();
            //입력 받은 값이랑 답이랑 비교한다.
            for(int i=0; i<3; i++){
                //알맞은 자리에 있는 경우
                if(swing[i] == answer.get(i)){
                    result.put("strike",result.getOrDefault("strike",0)+1);
                }
                else if(answer.contains(swing[i])&&swing[i] != answer.get(i)) {
                    /**문제!!!
                     * problem : 스트라이크가 아닌 경우 볼을 증가 시켰는데 Contains으로 인해 다음 반복에 동시에 증가하는 문제가 발생.
                     *
                     * 입력 시 동일한 값을 못 입력하게? 이건 아닌듯 전략으로 활용 될 수 있기 떄문.
                     * solution : 일단 다수의 if으로 구현 solid 위반이 심함
                     * 생각해 보니 이거는 ball나와야 정상적인 코드인것 같다.
                     */
                    result.put("ball", result.getOrDefault("ball", 0) + 1);
                }
            }
            //동일한 값이 하나도 없는321 경우.
            if(result.isEmpty())  result.put("nothion",0);

            System.out.println(result);
            if(result.getOrDefault("strike",0) ==3) break;
}


        //성공시 게임 종료를 출력


    }
}