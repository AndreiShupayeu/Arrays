public class Arrays2 {
    public static void main(String[] args) {
        int[][] dArray = new int [3][];
        for (int n =0; n<3; n++)
            dArray[n] = new int [n +1];
System.out.println(dArray);

    }
}