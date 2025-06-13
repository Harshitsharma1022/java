class matrix2Darray {
    public static void main(String[] args) {
        int[][] matrix = { {1, 12, 26 }, { 19, 25, 24 }, { 67, 18, 99 } };



        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}