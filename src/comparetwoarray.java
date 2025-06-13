class comparetwoarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        if (arr1.length != arr2.length){
            System.out.println("Arrays are not equal");
            return;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("Arrays are not equal");
                return;
            }
        }
        System.out.println("Arrays are equal");
    }
}