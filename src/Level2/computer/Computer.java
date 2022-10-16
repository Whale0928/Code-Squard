package Level2.computer;

import java.util.Map;

public interface Computer {
    /** 구현해야 하는 기능
     *  1. 답을 생성
     *  3. 예외를 처리하는 로직
     *  4. 답이 맞는지 체크하는 로직
     *  FundingDetail selectFundingDetail(int fundingNo);
     */

    /**랜덤한 수 3가지를 만들어 인트형 3칸 배열로 반환하는 메서드
     * @return
     */
     int[] makeAnswer();


    //입력받은 배열과 답을 비교해 결과를 반환하는 메서드
    Map<String, Integer> checking(int[] answer , int[]swing);

    //결과를 출력하고 반복할지 끈낼지 결정하는 메서드
    boolean chkResult(Map<String,Integer> map);

}
