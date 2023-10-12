package school;

public class UpDownLeftRight {
    public int[] solution(int n, String[] plan) {
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        String[] moveType = {"U","D","L","R"};

        int x = 1;
        int y = 1;
        int index = 0;
        for (String s : plan) {
            int nx = x;
            int ny = y;
            switch (s) {
                case "U" -> {
                    index = 0;
                    nx += dx[index];
                    ny += dy[index];
                }
                case "D" -> {
                    index = 1;
                    nx += dx[index];
                    ny += dy[index];
                }
                case "L" -> {
                    index = 2;
                    nx += dx[index];
                    ny += dy[index];
                }
                default -> {
                    index = 3;
                    nx += dx[index];
                    ny += dy[index];
                }
            }
            if(!(nx > n || nx < 1 || ny > n || ny < 1)) {

                x = nx;
                y = ny;
            }


        }
        return new int[]{x,y};
    }
    public static void main(String[] args) {
        UpDownLeftRight upDownLeftRight = new UpDownLeftRight();

        int[] solution = upDownLeftRight.solution(5, new String[]{"R", "R", "R", "U", "D", "D"});

        for (int i : solution) {
            System.out.println(i);
        }
    }
}
