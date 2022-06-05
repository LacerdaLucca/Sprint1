import java.util.Scanner;

public class Quiz {
    private Pergunta[] listaPergunta;
    private int quantPerguntas;
    private int quantAcertos;

    public Quiz(){
        String arquivoQuiz = "quiz.txt";
//        this.quantPerguntas = questao7.Entradas.contLines(arquivoQuiz)/3;
        String arq = Entradas.readArq(arquivoQuiz);
        String[] split = arq.split("P: ");
        this.quantPerguntas = split.length-1;
        this.listaPergunta = new Pergunta[quantPerguntas];
        for(int i = 1; i <= quantPerguntas; i++) {
            int j = i-1;
            split[i] = split[i].replace("A:", ":").replace("G:", ":");
            String[] conteudos  = split[i].split(": ");
            String enunciado = conteudos[0];
            String aux = conteudos[1];
            String[] alternativas = aux.split(";");
            char resp = conteudos[2].charAt(0);
            this.listaPergunta[j] = new Pergunta(enunciado,alternativas,resp);
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

    private void checkGabarito(char s, Pergunta p){
        s = Character. toUpperCase(s);
        while((s > (65 + (p.getAlternativas().length-1)) || s < 65) && p.getAlternativas().length !=0){
            System.out.println("Alternativa invalida " + s + "tente novamente");
            s = Entradas.readString().charAt(0);
            s = Character. toUpperCase(s);
        }
        if(s == p.getResposta()){
            this.quantAcertos ++;
        }
    }

    private void resultado(Usuario usuario){
        System.out.println("Usuario " + usuario.getNome() +
                "\nAcertos " + usuario.getAcertos() +
                "\nErros " + usuario.getErros());
    }
    public void jogar(Usuario usuario){
        char respUsuario;
        for(int i = 0; i < quantPerguntas; i++){
             listaPergunta[i].getPergunta();
             respUsuario = Entradas.readString().charAt(0);//Poderia ser um readChar
             checkGabarito(respUsuario, listaPergunta[i]);

        }
        usuario.setAcertos(quantAcertos);
        usuario.setErros(quantPerguntas-quantAcertos);
        resultado(usuario);
    }

}
