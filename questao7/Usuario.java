public class Usuario {
    private String nome;
    private String senha;

    public Usuario(){
        this.nome = "";
        this.senha = "";
    }
    public Usuario(String nome){
        this.nome = nome;
        this.senha = "";

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }


}