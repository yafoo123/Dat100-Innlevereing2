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
                sb.append(","); // add comma between numbers
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

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
