package Level2.user;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserImpl implements User{

    /// 입력을 받고 예외 혹은 값을 전달하는 메서드.
    @Override
    public int[] inputNumbers() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (String.valueOf(number).length() != 3) {
            throw new InputMismatchException();
        }

        return strToArray(number);
    }

    //입력받은 수를 int배열로 변환해 반환 하는 메서드
    @Override
    public int[] strToArray(int n) {
        String[] arr = String.valueOf(n).split("");
        int[] iArr= Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        return iArr;
    }
}
