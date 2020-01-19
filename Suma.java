public class Suma {
    public static int findSumWithoutUsingStream(int[] array) {
        int sum = 0;
        
        for (int value : array) {
            sum += value;
        }

        return sum;
    }

    public static void main(String args[]) {
        int[] numbers = {10,20,30,40,50};
        int sum = findSumWithoutUsingStream(numbers);
        System.out.println(sum);
    }
}