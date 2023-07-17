package Day1;

public class MaxValue {
    public static void main(String[] args) {
        int arr[] = {5, 98, 43, 1, 321, 43};
        int maxValue=arr[0];
        for(int i=1;i<arr.length;i++) {
            if (arr[i]>maxValue) maxValue=arr[i];
        }
        System.out.println(maxValue);
    }
}
