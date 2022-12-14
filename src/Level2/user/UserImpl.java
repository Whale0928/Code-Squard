package Level2.user;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserImpl implements User{

    /// 입력을 받고 예외 혹은 값을 전달하는 메서드.
    @Override
    public int[] inputNumbers() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        String number = sc.nextLine();
        if (number.length() != 3) {
            throw new InputMismatchException();
        }
        return strToArray(number);
    }

    //입력받은 수를 int배열로 변환해 반환 하는 메서드
    @Override
    public int[] strToArray(String n) {
        String[] arr = n.split("");
        return Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
    }
}
