package JavaTutorial;

public class HarmonikList {
    public static  void  main(String[] args){
        double[] list = {15, 6, 7, 12, 7,9,3};
        double sum = 1.0;
        for (int i = 1 ; i < list.length; i++){
            sum += (1.0 / i);

        }
        double avarage = list.length / sum;
        System.out.println(avarage);

    }
}
