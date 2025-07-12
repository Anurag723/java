class gener<T>{
    private T[] arr;

    public gener(T[] arrip){
        this.arr = arrip;
    }

    void res(int beg, int end){
        while (beg<end) {
            T temp = arr[beg];
            arr[beg] = arr[end];
            arr[end] = temp;

            beg++;
            end--;
        }
    }

    void display() {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}

public class generics9 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "peas", "berry"};
        gener<String> obj = new gener<>(arr);

        System.out.println("Original:-");
        obj.display();
        
        obj.res(1,3);
        
        System.out.println("after update:-");
        obj.display();
    }
}
