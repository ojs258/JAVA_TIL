package StackAndQueue;
import java.util.*;

public class PriorityQueue {
    public int solution(int[] priorities, int location) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < priorities.length; i++) {
            map.put(i,priorities[i]);
        }

        Queue<Integer> q = new LinkedList<>(
                Arrays.asList(Arrays.stream(priorities)
                        .boxed()
                        .toArray(Integer[]::new)));
        return 1;

    }
    // 현재 index와 값이 담긴 객치 priority가를 리스트에 저장
    // priority가 내림차순으로 정렬될 때까지 왼쪽 쉬프트 연산.
    // 내림차순으로 정렬되고 나면 그 때의 인덱스가 rank
    // 객체의 index가 location과 일치하는 요소의 인덱스를 리턴.
    class priority{
        int index;
        int number;

        public priority(int index, int number) {
            this.index = index;
            this.number = number;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
