public class Arraydeneme5 {
    public static void main(String[] args) {
        int[] dizi = {5, 6, 2, 1, 9, 2, 4, 2, 4, 6, 9, 8, 2, 6};
        int[] frekanslar=new int[9];

        for (int i=0; i<dizi.length; i++)
        {
            frekanslar[dizi[i]-1]++;

            if (frekanslar[dizi[i]-1] > 1)
                dizi[i]=0;
        }

        for (int i=0; i<dizi.length; i++)
        {
            if (dizi[i] != 0)
                System.out.print(dizi[i]+" ");
        }
    }
}
