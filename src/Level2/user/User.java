package Level2.user;

import java.util.InputMismatchException;

public interface User {
    /*  구현해야 하는 기능
     *  1.답을 입력하는 로직
     */

    //입력받은 값을 전달하는 메서드
    int[] inputNumbers() throws InputMismatchException;

    //파라미터로 전달받은 정수를 배열로 반환하는 메서드
    int[] strToArray(String n);
}
