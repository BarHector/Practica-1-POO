import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner art= new Scanner(System.in);
        double number, suma=0;
        
        while(art.hasNextInt() || art.hasNextDouble()){
            number = art.nextDouble();
            suma+= number;
        }

        if(suma%1==0){
            System.out.println((int)suma);
        }else{
            System.out.println(suma);
        }

        art.close();
    }    
}