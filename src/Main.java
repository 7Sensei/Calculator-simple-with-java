import java.util.Scanner;

public class Main extends Hasil{
    public static void main(String[] args) {

        Hasil total = new Hasil();
        int end;
        Scanner userInput = new Scanner(System.in);
        int angkaSatu;
        String operator;
        int angkaDua;
        int hasil;
        String getYseOrNo;
        boolean yesOrNo = true;

        while (yesOrNo){
            System.out.print("Masukan angka pertama : ");
            angkaSatu = userInput.nextInt();

            System.out.print("Operator yang dipilih ( +, -, :, x ) : ");
            operator = userInput.next();

            System.out.print("Masukan angka kedua : ");
            angkaDua = userInput.nextInt();

            switch (operator){
                case "+":
                    hasil = angkaSatu + angkaDua;
                    end = total.getHasil(hasil);
                    break;
                case "-":
                    hasil = angkaSatu - angkaDua;
                    end = total.getHasil(hasil);
                    break;
                case "/":
                    hasil = angkaSatu / angkaDua;
                    end = total.getHasil(hasil);
                    break;
                case "*":
                    hasil = angkaSatu * angkaSatu;
                    end = total.getHasil(hasil);
                    break;
                default:
                    System.out.println("Operator " + operator + "tidak ditemukan, Mohin masukan operator yang benar");
            }

            System.out.println("===========================");
            System.out.println("\tHASIL INPUT\t");
            System.out.println("===========================");
            System.out.println("Angka ke-1 : " + angkaSatu);
            System.out.println("Operator   : " + operator);
            System.out.println("Angka ke-2 : " + angkaDua);
            System.out.println("===========================");
            System.out.print("HASIL      : ");
            total.show();
            System.out.println("===========================");

            System.out.print("ketik y untuk lanjut dan ketik n untuk tidak : " );
            getYseOrNo = userInput.next();
            System.out.println();
            if (getYseOrNo.equals("y")){
                yesOrNo = true;
            } else {
                yesOrNo = false;
            }

        }

    }
}

class Hasil{

    int hasil;

    public int getHasil(int hasil) {
        this.hasil = hasil;
        return this.hasil;
    }

    void show(){
        System.out.println(this.hasil);
    }
}
