public class Cosmetico extends Loja{
 
    protected double taxaComercializacao;
    
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, int qtdeMaxProdutos, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, qtdeMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco, Data data, int qtdeMaxProdutos, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, endereco, data, qtdeMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public double getTaxaComercializacao(){
        return this.taxaComercializacao;
    }
    
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
    
    @Override
    public String toString(){
        return "Nome da loja: " + this.nome + "\nQuantidade de funcionários: " + this.quantidadeFuncionarios + "\nSalário base dos funcionarios: R$" + 
        this.salarioBaseFuncionario + "\nEndereço: " + this.endereco + "\nData: " + this.dataFundacao + "\nTaxa de comercialização: " 
        + this.taxaComercializacao;        
    }
}