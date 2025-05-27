package code;

public class fizzbuzz {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int i : arr) {
            if (i%3==0) System.out.println(i + " Fizz");
            else if(i%3==0 && i%5==0) System.out.println(i + " Fizz Buzz");
            else if (i%5==0) {
                System.out.println(i + " Buzz");
            }
        }
    }
}
