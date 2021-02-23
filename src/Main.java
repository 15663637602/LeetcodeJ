import medium.MaxDistanceFromLand1162.MaxDFromLand;
import medium.MaxIslandArea695.MaxIslandArea;

public class Main {
    public static void main(String[] args) {
        int[][] in = {{1,0,1},{0,0,0},{1,0,1}};
        MaxDFromLand instance = new MaxDFromLand();
        int res = instance.maxDistance(in);
        System.out.println(res);
    }
}
