import java.util.Scanner;

public class ciftSayi_4dunKati{
    public static void main(String[] args) {
        int a , total = 0;

        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("sayiniziz giriniz: ");
            a = inp.nextInt();
            if(a % 2 == 1){
                break;
            }else if(a % 4 == 0){
                total+=a;
            }
        }while(a > 0);

        System.out.println("sayilarin 4 kati:" + total);
    }
}