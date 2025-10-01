package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

        for (int[] i : matrise) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

	// b)
	public static String tilStreng(int[][] matrise) {

        String strengMatrise = "";
        for(int[] i : matrise){
            for(int j : i){
                strengMatrise += j + " ";
            }
            strengMatrise += "\n";
        }
        return strengMatrise;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

        int radStrl = matrise.length;
        int radlengde = matrise[0].length;

        int [][] nyMatrise = new int[radStrl][radlengde];

        for(int i = 0; i < matrise.length; i++){
            for(int j = 0; j <radlengde; j++){
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nyMatrise;

	}

	// d)
    public static boolean erLik(int[][] a, int[][] b) {
        if(a == null && b == null){
            return true;
        }
        if(a == null || b == null){
            return false;
        }

        if (a.length != b.length){
            return false;
        }

        for(int i = 0; i < a.length; i++){
            if(a[i] == null && b[i] == null){
                continue;
            }
            if(a[i] == null || b[i] == null){
                return false;
            }
            if(a[i].length != b[i].length){
                return false;
            }
            for(int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
