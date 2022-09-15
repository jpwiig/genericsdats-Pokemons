public class Generics2 {

    public static void main(String[] args) {
    Integer[]x= {12,3,45,9,99,0,6,8};


    }

    public static <T extends Comparable <? super T>> int max( T[]x ){
        int max = 0;
        T maxValue = x[max];
        for (int j = 1; j < x.length; j++) {
            //legg til en if -setning som sjekker om det er flere like tall, hvis det er flere like tall, så skipper den over den første om sammenligner med den siste
            if (x[j].compareTo(x[max])> 0) max = j;
        }
        return max;
    }
}
