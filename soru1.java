import java.util.Random;
public class soru1 {
    public String isim;
    public int konum;
    soru1(String isim,int konum){
        this.isim=isim;
        this.konum=konum;
    }
    public static void main(String[] args) {
        soru1 Tavsan = new soru1("T",1);
        soru1 Kaplumbaga = new soru1("K",1);
        Random randomT = new Random();
        Random randomK = new Random();
        while(Tavsan.konum!=20 && Kaplumbaga.konum!=20){
            int t = randomT.nextInt(10)+1;
            if(t>=1 && t<=2){
                System.out.print("");
            }
            if(t>=3 && t<=4){
                Tavsan.konum=Tavsan.konum+9;
                if(Tavsan.konum>20){
                    Tavsan.konum=20;
                }
            }
            if(t==5){
                if(Tavsan.konum<=12){
                    Tavsan.konum=1;
                }
                else{
                    Tavsan.konum=Tavsan.konum-12;
                }
            }
            if(t>=6 && t<=8){
                Tavsan.konum=Tavsan.konum+1;
                if(Tavsan.konum>20){
                    Tavsan.konum=20;
                }
            }
            if(t>=9 && t<=10){
                if(Tavsan.konum<=2){
                    Tavsan.konum=1;
                }
                else{
                    Tavsan.konum=Tavsan.konum-2;
                }
            }
            int k = randomK.nextInt(10)+1;
            if(k>=1 && k<=5){
                Kaplumbaga.konum=Kaplumbaga.konum+3;
                if(Kaplumbaga.konum>20){
                    Kaplumbaga.konum=20;
                }
            }
            if(k>=6 && k<=7){
                if(Kaplumbaga.konum<=6){
                    Kaplumbaga.konum=1;
                }
                else{
                    Kaplumbaga.konum=Kaplumbaga.konum-6;
                }
            }
            if(k>=8 && k<=10){
                Kaplumbaga.konum=Kaplumbaga.konum+1;
                if(Kaplumbaga.konum>20){
                    Kaplumbaga.konum=20;
                }
            }
            for(int a=1;a<=20;a++){
                if(a==Tavsan.konum){
                    System.out.print("T");
                }
                else if(a==Kaplumbaga.konum){
                    System.out.print("K");
                }
                else if(a==Tavsan.konum && a== Kaplumbaga.konum){
                    System.out.print("OUCH");
                }
                else{
                    System.out.print("_");
                }

            }
            System.out.println("");
        }
        if(Tavsan.konum==20){
            System.out.println("Tavşan kazandı, yuh!");
        }
        if(Kaplumbaga.konum==20){
            System.out.println("Kaplumbağa kazandı, oley!");
        }
        if(Tavsan.konum==20 && Kaplumbaga.konum==20){
            System.out.println("Berabere");
        }
    }
}
