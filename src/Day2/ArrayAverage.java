package Day2;

public class ArrayAverage {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        int arrSum=0;
        for(int arrItem:arr) arrSum+=arrItem;
        System.out.println((double) arrSum/arr.length);
    }
}
