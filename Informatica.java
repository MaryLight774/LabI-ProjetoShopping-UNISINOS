public class Informatica extends Loja{
    
    protected double seguroEletronicos;
    
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, int qtdeMaxProdutos, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, qtdeMaxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data data, int qtdeMaxProdutos, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, endereco, data, qtdeMaxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public double getSeguroEletronicos(){
        return this.seguroEletronicos;
    }
    
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }
    
    @Override
    public String toString(){
        return "Nome da loja: " + this.nome + "\nQuantidade de funcionários: " + this.quantidadeFuncionarios + "\nSalário base dos funcionarios: R$" + 
        this.salarioBaseFuncionario + "\nEndereço: " + this.endereco + "\nData: " + this.dataFundacao + "\nSeguro eletronicos: " 
        + this.seguroEletronicos;        
    }
}