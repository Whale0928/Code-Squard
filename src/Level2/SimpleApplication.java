package Level2;

import Level2.computer.Computer;
import Level2.computer.ComputerImpl;
import Level2.user.User;
import Level2.user.UserImpl;

import java.util.Arrays;
import java.util.Map;

public class SimpleApplication {

    public static void main(String[] args) {
        Computer computer = new ComputerImpl();
        User user = new UserImpl();

      int[] answer = computer.makeAnswer();
      int[] swing;

        while (true) {
            while (true) {
                try {
                    swing = user.inputNumbers();
                    if(swing.length == 3) break;
                } catch (Exception e) {
                    System.out.println("3자리 정수만 입력해주세요");
                }
            }
            System.out.println(Arrays.toString(answer));
            System.out.println(Arrays.toString(swing));
            Map<String,Integer> result  = computer.checking(answer,swing);
            if (computer.chkResult(result)) break;
        }
    }
}