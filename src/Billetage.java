public class Billetage {

    public static void main(String[] args) {
        int somme = 27;
        System.out.println("RESULTAT DECOMPOSITION: " + somme);
        int[] decompose = decompose(somme);
        if (decompose != null) {
            System.out.println(decompose[0] + "-" + decompose[1] + "-" + decompose[2]);
        } else {
            System.out.println("Impossible");
        }
    }

    private static int[] decompose(int montant) {
        int ten, five = 0, two = 0;
        int max10 = montant / 10, max5, max2;
        boolean found = false;

        for (ten = max10; ten >= 0; ten--) {
            int reste5 = reste(montant, 10, ten);
            if (reste5 > 0) {
                max5 = reste5 / 5;
                for (five = max5; five >= 0; five--) {
                    int reste2 = reste(reste5, 5, five);
                    if (reste2 > 0) {
                        max2 = reste2 / 2;
                        for (two = max2; two >= 0; two--) {
                            int reste = reste(reste2, 2, two);
                            if (reste == 0) {
                                found = true;
                                break;
                            }
                        }
                    } else {
                        found = true;
                        break;
                    }
                    if (found) {
                        break;
                    }
                }
            } else {
                found = true;
                break;
            }
            if (found) {
                break;
            }
        }

        if (found) {
            return new int[]{ten, five, two};
        } else {
            return null;
        }
    }

    private static int reste(int somme, int diviseur, int quotient) {
        return somme - (quotient * diviseur);
    }
}
