import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        int month = 0 , day;
        String burc = "";
        boolean a = false;

        Scanner input = new Scanner(System.in);
        System.out.print("dogdugunuz ay: ");
        month = input.nextInt();

        System.out.print("dogdugunuz gun: ");
        day = input.nextInt();
        
        if(month==1){
            if(day >= 1 && day <= 31){
                if(day < 22){
                    burc = "oglak";
                }else{
                    burc = "kova";
                }
            }else{
                a = true;
            }
        }else if(month==2){
            if(day >=1 && day <= 28){
                if(day < 20){
                    burc = "kova";
                }else{
                    burc = "balik";
                }
            }else{
                a = true;
            }
        }else if(month==3){
            if(day >=1 && day <=31){
                if(day < 21){
                    burc = "balik";
                }else{
                    burc = "koc";
                }
            }else{
                a = true;
            }
        }else if(month==4){
            if(day >=1 && day <= 30){
                if(day < 21){
                    burc = "koc";
                }else{
                    burc = "boga";
                }
            }else{
                a = true;
            }
        }else if(month==5){
            if(day >= 1 && day <=31){
                if(day < 22){
                    burc = "boga burcu";
                }else{
                    burc = "ikizler burcu";
                }
            }else{
                a = true;
            }
        }else if(month==6){
            if(day >=1 && day <=30){
                if(day < 23){
                    burc = "ikizler";
                }else{
                    burc = "yengec";
                }
            }else{
                a = true;
            }
        }else if(month==7){
            if(day >=1 && day <=30){
                if(day < 23){
                    burc ="yengec";
                }else{
                    burc = "aslan";
                }
            }else{
                a = true;
            }
        }else if(month==8){
            if(day >=1 && day <= 31){
                if(day < 23){
                    burc = "aslan";
                }else{
                    burc = "basak";
                }
            }else{
                a = true;
            }
        }else if(month==9){
            if(day >=1 && day <= 30){
                if(day < 23){
                    burc = "basak";
                }else{
                    burc = "terazi";
                }
            }else{
                a = true;
            }
        }else if(month==10){
            if(day >=1 && day <=31){
                if(day <23){
                    burc = "terazi";
                }else{
                    burc = "akrep";
                }
            }else{
                a = true;
            }
        }else if(month==11){
            if(day >=1 && day <=30){
                if(day < 22){
                    burc = "akrep";
                }else{
                    burc = "yay";
                }
            }else{
                a = true;
            }
        }else if(month==12){
            if(day >=1 && day <= 31){
                if(day < 22){
                    burc = "yay";
                }else{
                    burc = "oglak";
                }
            }else{
                a = true;
            }
        }else{
            a = true;
        }

        if(a){
            System.out.print("hatali giris yaptiniz !");
        }else{
            System.out.println("burcunuz: " + burc);
        }

       
     

    }
}
