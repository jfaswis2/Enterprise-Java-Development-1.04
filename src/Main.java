public class Main {
    public static void main(String[] args) {
        int[] num = {8, 9, 6, 6, 15, 6, 9, 6, 1};
        mayorMenor(num);
        primeroSegundo(num);
    }

    public static void mayorMenor(int[] num) {

        if (num.length >= 1) {

            int numMayor = 0;
            int numMenor = num[0];

            for (int i = 0; i < num.length; i++) {
                if (num[i] >= numMayor) {
                    numMayor = num[i];
                }

                if (num[i] <= numMenor) {
                    numMenor = num[i];
                }
            }
            System.out.println("Numero mayor: " + numMayor + "\n" + "Numero menor: "
                    + numMenor);
            System.out.println("La diferencia es de: " + (numMayor - numMenor));
        } else {
            System.out.println("La longitud del array debe ser igual o mayor a 1");
        }
    }

    public static void primeroSegundo(int[] num) {

        int numMenor = num[0];
        int numSegundo = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] <= numMenor) {
                numMenor = num[i];
            }
        }

        for (int i = 0; i < num.length; i++) {
            if((num[i] > numMenor )){
                if (num[i] <= numSegundo) {
                    numSegundo = num[i];
                }
            }
        }

        System.out.println("Menor numero: " + numMenor);
        System.out.println("Segundo menor numero: " + numSegundo);

    }


}