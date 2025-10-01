package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

        for(int j : tabell){
            System.out.print(j  + " ");
        }

	}

	// b)
    public static String tilStreng(int[] tabell) {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tabell.length; i++) {
            sb.append(tabell[i]);
            if (i < tabell.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // c)
    public static int summer(int[] tabell) {

        int sum = 0;
        System.out.print("[");
        for (int j : tabell) {
            System.out.print(j + " ");
            sum += j;
        }
        System.out.println("]");
        System.out.println("summen av tabellen er " + sum);
        return sum;
    }

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

        boolean liktTall = false;
        for(int i : tabell){
            if(i == tall){
                liktTall = true;
                break;
            }
        }
        System.out.println(liktTall);
        return liktTall;
	}

	// e)
    public static int posisjonTall(int[] tabell, int tall) {


        for(int i = 0; i < tabell.length; i++) {
            if (tall == tabell[i]) {
                System.out.println(tall + " funnet på  index " + i);
                return i;
            }
        }
        System.out.println("-1");
        return -1;
    }

	// f)
    public static int[] reverser(int[] tabell) {
        int size = tabell.length;
        int[] tabell1 = new int[size];

        int j = 0;
        for (int i = tabell.length - 1; i >= 0; i--) {
            tabell1[j] = tabell[i];
            j++;
        }
        return tabell1;
    }

	// g)
	public static boolean erSortert(int[] tabell) {

        for(int i = 0; i < tabell.length - 1; i++){
            if(tabell [i] > tabell[i + 1]){
                return false;
            }
        }
        return true;
	}

	// h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int size = tabell1.length + tabell2.length;
        int[] tabell3 = new int[size];

        for(int i = 0; i < tabell1.length; i++){
            tabell3[i] = tabell1[i];
        }
        for(int i = 0; i < tabell2.length; i++){
            tabell3[tabell1.length + i] = tabell2[i];
        }
        return tabell3;
    }
}
