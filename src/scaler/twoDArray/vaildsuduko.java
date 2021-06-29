package scaler.twoDArray;

public  class vaildsuduko {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int isValidSudoku(final String[] A) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[][] mat = new int[3][3];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (A[i].charAt(j) != '.') {
                    int mask = 1 << (A[i].charAt(j) - '0');
                    System.out.println((A[i].charAt(j) - '0') + "  "+mask);
                    if ((row[i] & mask) == 0 && (col[j] & mask) == 0 && (mat[i / 3][j / 3] & mask) == 0) {
                        row[i] ^= mask;
                        System.out.println(row[i]);
                        col[j] ^= mask;
                        mat[i / 3][j / 3] ^= mask;
                    } else
                        return 0;

                }
            }
        }

        return 1; 
    }
    public static void main(String[] args) {
		
    	String s[] =  {"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
    	System.out.println(isValidSudoku(s));
	}
}


