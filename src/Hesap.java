public class Hesap {
    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5};
        double harmonicAvarage=0;

        for (int i=0;i<numbers.length;i++){

            harmonicAvarage +=  1.0/numbers[i];
        }


        double result = numbers.length/harmonicAvarage;
        System.out.println("Harmonik Ortalama: " + result);
    }
}
