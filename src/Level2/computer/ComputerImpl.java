package Level2.computer;

import java.util.*;

public class ComputerImpl implements Computer{

    /**
     * 랜덤한 수 3가지를 만들어 인트형 3칸 배열로 반환하는 메서드
     * @return int [3] answer
     */
    @Override
    public int[] makeAnswer() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) numbers.add(i);
        Collections.shuffle(numbers,new Random());
        return numbers.stream().limit(3).mapToInt(Integer::intValue).toArray();
    }

    @Override
    public Map<String, Integer> checking(int[] answer, int[] swing) {
        Map<String,Integer> map =new HashMap<>();
        for(int i=0; i<3; i++){
            if(answer[i] == swing[i]){
                map.put("S",map.getOrDefault("S",0)+1);
            }else if(Arrays.asList(answer).contains(swing[i])){
                map.put("B",map.getOrDefault("B",0)+1);
            }
        }
        if(map.isEmpty()) map.put("N",1);
        return map;
    }

    @Override
    public boolean chkResult(Map<String, Integer> map) {
        for(String key : map.keySet()){

            if(map.get(key)>=1) {
                if(key.equals("N")){
                    System.out.println("Nothing");
                    return false;
                }else if(key.equals("S")&&map.get(key)==3){
                    return true;
                }
                System.out.println(key+" = "+map.get(key));
            }
        }
        return true;
    }
}
