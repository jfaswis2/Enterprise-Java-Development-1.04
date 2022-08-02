public class Main {
    public static void main(String[] args) {
        int[] num = {5,9,3,4,15,2,2,5,1};
        mayorMenor(num);
    }

    public static void mayorMenor(int[] num){

        if(num.length>= 1) {

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
        } else{
            System.out.println("La longitud del array debe ser igual o mayor a 1");
        }
    }

    public static void primeroSegundo(){

    }

}