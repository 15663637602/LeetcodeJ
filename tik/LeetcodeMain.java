import medium.DailyTemperature739.DailyTem;

public class LeetcodeMain {
    public static void main(String[] args) {
        DailyTem test = new DailyTem();
        int[] in = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] res = test.dailyTemperatures(in);
        for (int i = 0; i < res.length; i++) {
            System.out.print(i + " ");
        }
    }
}
