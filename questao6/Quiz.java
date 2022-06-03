import java.util.Scanner;

public class Quiz {
    private Pergunta[] listaPergunta;
    private int quantPerguntas;
    private int quantAcertos;

    public Quiz(){
        this.listaPergunta = new Pergunta[10];
        for(int i = 0; i < quantPerguntas; i++) {
            this.listaPergunta[i] = new Pergunta();
        }
    }

    public void setListaPergunta(Pergunta[] perguntas) {
        try{
        this.listaPergunta = perguntas;
        }catch(Exception ex){

        }
    }

    public void setPergunta(Pergunta pergunta, int i){
        this.listaPergunta[i] = pergunta;
    }

    public Pergunta[] getListaPergunta() {
        return listaPergunta;
    }

    public void checkResposta(String s){

    }

    public void checkGabarito(String s){

    }

    public void jogar(){
        String respUsuario;
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < quantPerguntas; i++){
             System.out.println(listaPergunta[i].getEnunciado()
                     +listaPergunta[i].getAlternativas());
             respUsuario = teclado.next();
             checkResposta(respUsuario);
             checkGabarito(respUsuario);

        }
    }
}
