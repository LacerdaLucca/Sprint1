import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Entradas {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static String readString(){
        String resp = "";
        char tmp;
        try {
            do{
                tmp = (char)in.read();
                if(tmp != '\n' && tmp != ' ' && tmp != 13){
                    resp += tmp;
                }
            }while(tmp != '\n' && tmp != ' ');
        }catch(Exception ex){
            System.out.println("Essa entrada nao é valida digite novamente");
            resp = readString();
        }
        return resp;
    }
    public static int readInt(){
        int resp = 0;
        try{
            resp = Integer.parseInt(readString());
        }catch (Exception ex){
            System.out.println("Essa entrada nao é valida digite novamente");
            resp = readInt();
        }
        return resp;
    }
    public static double readDouble(){
        double resp = 0;
        try{
            resp = Double.parseDouble(readString());
        }catch (Exception ex){
            System.out.println("Essa entrada nao é valida digite novamente");
            resp = readDouble();
        }
        return resp;
    }


    public static String readArq(String arq){
        String resp = "";
        try {
            FileInputStream stream = new FileInputStream(arq);
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            String linha = br.readLine();
            while (linha != null) {
                resp += linha;
                linha = br.readLine();
            }
        }catch(Exception ex){
            System.out.println("Erro na entrada, quer tentar de novo?");
            String nt = readString();
            if(nt.equals("sim") || nt.equals("s")) {
                resp = readArq(arq);
            }
        }
        return resp;
    }
    public static int contLines(String arq){
        int cont = 0;
        try {
            FileInputStream stream = new FileInputStream(arq);
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            String linha = br.readLine();
            while (linha != null) {
                cont ++;
                linha = br.readLine();
            }
        }catch(Exception ex){
            System.out.println("Erro na entrada, quer tentar de novo?");
            String nt = readString();
            if(nt.equals("sim") || nt.equals("s")) {
                cont = contLines(arq);
            }
        }
        return cont;
    }
}
