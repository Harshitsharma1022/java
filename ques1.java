// Create a method that finds and returns the smallest number in an array.
class ques1{
    static void min(int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println( min);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        min(arr);
    }
}