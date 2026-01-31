public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {8,5,9,2,7,2};
        int sum = 0;
        for(int i = 0;i<6;i++){
            sum += arr[i];
        }
        System.out.println("Total sum = "+ sum);
    }
}