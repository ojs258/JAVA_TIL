package school.week8;
public class SetRightmostUnsetBit {
    public int setRightmostUnsetBit(int num) {
        return num | num + 1;
    }

    public static void main(String[] args) {
        int result = new SetRightmostUnsetBit()
                .setRightmostUnsetBit(21);
        System.out.println(result);
    }
}