package questao7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Entradas {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static String readString(){
        String retorno = "";
        char tmp;
        try {
            do{
                tmp = (char)in.read();
                if(tmp != '\n' && tmp != ' ' && tmp != 13){
                    retorno += tmp;
                }
            }while(tmp != '\n' && tmp != ' ');
        }catch(Exception ex){
            System.out.println("Essa entrada nao é valida digite novamente");
            retorno = readString();
        }
        return retorno;
    }
    public static int readInt(){
        int retorno = 0;
        try{
            retorno = Integer.parseInt(readString());
        }catch (Exception ex){
            System.out.println("Essa entrada nao é valida digite novamente");
            retorno = readInt();
        }
        return retorno;
    }
    public static double readDouble(){
        double retorno = 0;
        try{
            retorno = Double.parseDouble(readString());
        }catch (Exception ex){
            System.out.println("Essa entrada nao é valida digite novamente");
            retorno = readDouble();
        }
        return retorno;
    }
}
