public class Quis {
    private Pergunta[] perguntas;

    public Quis(){
        this.perguntas = new Pergunta[10];
        for(int i = 0; i < 10; i++) {
            this.perguntas[i] = new Pergunta();
        }
    }

    public void setPerguntas(Pergunta[] perguntas) {
        this.perguntas = perguntas;
    }

    public void setPergunta(Pergunta pergunta, int i){
        this.perguntas[i] = pergunta;
    }

    public Pergunta[] getPerguntas() {
        return perguntas;
    }
}
