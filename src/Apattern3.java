class Apattern3 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("A");
            }
            for (int s = 1; s < i; s++) {
                System.out.print("A");
            }
            System.out.println();
        }


    }
}



