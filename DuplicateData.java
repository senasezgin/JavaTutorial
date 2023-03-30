package JavaTutorial;

import java.util.Arrays;

public class DuplicateData {
    static boolean kontrol(int[] dizi ,  int value ){
        for(int i : dizi){
            if (value ==  i ){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        int[] dizi  = {1,2,123,1,23,2,32,123,1};
        int[] tkr  = new int[dizi.length];
        int sayac  = 0;
        for (int i = 0 ; i< dizi.length;i++){
            for(int j = 0 ; j < dizi.length;j++){
                if (i != j && dizi[i]== dizi[j]){
                    if(kontrol(tkr,dizi[i]) && (dizi[i]%2 == 0)){
                        tkr[sayac++] = dizi[i];
                    }
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(tkr));
    }
}
