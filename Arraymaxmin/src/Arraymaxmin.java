import java.util.Scanner;
import java.util.Arrays;
public class Arraymaxmin {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int inp = input.nextInt();

        int enK=0;
        int inkB=0;

        for (int i=0; i<list.length; i++){
            if (list[i]>inp) {
                enK = list[i-1];
                break;
            }
            if (list[i]<inp){
                inkB=list[i+1];
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+enK);
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+inkB);
    }
}
