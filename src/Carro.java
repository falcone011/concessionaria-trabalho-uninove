public class Carro{
    
    private String nome;
    private int qtdPassageiros;
    private static int qtdCarro;
    private static int qtdTotalDePassageiros;
    
    public Carro(String nome){
        this.nome = nome;
        this.qtdPassageiros = 0;
        Carro.qtdCarro++;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getQtdPassageiros(){
        return this.qtdPassageiros;
}

    public static int getQtdCarro(){
        return Carro.qtdCarro;
}
    public static int getQtdTotalDePassageiros(){
        return Carro.qtdTotalDePassageiros;
}
    public void EntrarNoCarro() {
        this.qtdPassageiros++;
        Carro.qtdTotalDePassageiros++;
        
    }
}
