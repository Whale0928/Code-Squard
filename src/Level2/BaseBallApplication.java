package Level2;

/**
 * 구현 제약사항
 * 함수(또는 메소드) 하나의 크기가 최대 10라인을 넘지 않도록 구현한다.
 * 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.
 * indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
 * 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
 * 전역 변수를 사용하지 않는다.
 */

import Level2.computer.Computer;
import Level2.computer.ComputerImpl;
import Level2.user.User;
import Level2.user.UserImpl;

import java.util.InputMismatchException;
import java.util.Map;

public class BaseBallApplication {

    /**
     * 프로세스의 시작을 담당하는 main 클래스.
     *
     * @param args
     */
    public static void main(String[] args) {
        Computer computer = new ComputerImpl();
        User user = new UserImpl();

      int[] answer = computer.makeAnswer();
      int[] swing = null;

while (true) {


        while (true) {

            try {
                /**문제 발생 !!!
                 * error: 스캐너 객체 생성 후 값을 입력 받은 후
                 *        객체 초기화를 진행 하지 않아서 무한 Exception이 발생했다.
                 * solution : 객체를 반복시 생성하는 방식으로 변경
                 */
                //기존 코드
                /*              sc = new Scanner(System.in);
                System.out.print("숫자를 입력해주세요 : ");
                int temp = sc.nextInt();

                if (String.valueOf(temp).length() != 3) {
                    throw new InputMismatchException();
                }

                //배열에 집어넣는 건데 메서드화 해야 한다.
                for (int i = 0; i < 3; i++) swing[i] = Integer.parseInt(String.valueOf((String.valueOf(temp).charAt(i))));
                break;*/

                swing = user.inputNumbers();
                if(swing.length == 3) break;
            } catch (InputMismatchException e) {
                System.out.println("3자리 정수만 입력해주세요");
            }
        }

             //동일한 값이 1개 이상 있?는 경우.

            //동일한 값이 1개 이상 있?는 경우.
            Map<String,Integer> result  = computer.checking(answer,swing);
            //입력 받은 값이랑 답이랑 비교한다.
            //기존 코드
        /*for(int i=0; i<3; i++){
                //알맞은 자리에 있는 경우
                if(swing[i] == answer.get(i)){
                    result.put("strike",result.getOrDefault("strike",0)+1);
                }
                else if(answer.contains(swing[i])&&swing[i] != answer.get(i)) {
                    **문제!!!
                     * problem : 스트라이크가 아닌 경우 볼을 증가 시켰는데 Contains으로 인해 다음 반복에 동시에 증가하는 문제가 발생.
                     *
                     * 입력 시 동일한 값을 못 입력하게? 이건 아닌듯 전략으로 활용 될 수 있기 떄문.
                     * solution : 일단 다수의 if으로 구현 solid 위반이 심함
                     * 생각해 보니 이거는 ball나와야 정상적인 코드인것 같다.

                    result.put("ball", result.getOrDefault("ball", 0) + 1);
                }
            }

            //동일한 값이 하나도 없는321 경우.
            if(result.isEmpty())  result.put("nothion",0);*/

        //결과를 확인하고 게임을 끈내거나 다시 수행.
        /* System.out.println(result);
           if(result.getOrDefault("strike",0) ==3) break;*/


    if (computer.chkResult(result)) break;

}



    }
}