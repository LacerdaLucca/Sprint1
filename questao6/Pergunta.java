public class Pergunta {
    private String enunciado;
    private String[] alternativas;
    private char resposta;

    public Pergunta(String enunciado, String[] alternativas, char resposta){
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.resposta = resposta;
    }
    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(char resposta) {
        this.resposta = resposta;
    }

    public void imprime(){
        getPergunta();
        System.out.println(this.resposta);
    }
    public void getPergunta(){
        System.out.println(this.enunciado);
        for (int i = 0; i < alternativas.length; i++) {
            if(i == 0) System.out.print("A) ");
            else if(i == 1) System.out.print("B) ");
            else if(i == 2) System.out.print("C) ");
            else if(i == 3) System.out.print("D) ");
            else if(i == 4) System.out.print("E) ");
            System.out.println(alternativas[i]);
        }
    }
}
