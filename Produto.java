public class Produto{
    
    private String nome;
    private double preco;
    private Data dataValidade;
    
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public Data getDataValidade(){
        return this.dataValidade;
    }
    
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    
    public boolean estaVencido(Data data){
        if (this.dataValidade.getAno() > data.getAno()){
            return false;
        } else if (this.dataValidade.getMes() > data.getMes()){
            return false;
        } else if(this.dataValidade.getDia() > data.getDia()){
            return false;
        } else {
            return true;
        }
    }
    
    @Override
    public String toString(){
        return "Nome do produto: " + this.nome + "\nPreço: R$ " + this.preco + "\nData de validade: " + this.dataValidade + "\n"; 
    }
}