package JavaTutorial;

public class ArrayFrequency {
    public static void main(String[] args){
        int[] dizi ={10, 20, 20, 10, 10, 20, 5, 20};
        for(int i: dizi){
            int count = 0;
            for(int j=0; i<dizi.length; j++){
                if(i == dizi[j]){
                    count++;

                }
            }
            if(count > 1) {
                System.out.println(count + " elemanı " + count + " kez tekrarlanıyor.");
            }
        }
    }
}
