public class Bijuteria extends Loja{
    
    protected double metaVendas;
    
    public Bijuteria (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, int qtdeMaxProdutos, double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, qtdeMaxProdutos);
        this.metaVendas = metaVendas;
    }
    
    public double getMetaVendas(){
        return this.metaVendas;
    }
    
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    
    @Override
    public String toString(){
        return "Nome da loja: " + this.nome + "\nQuantidade de funcionários: " + this.quantidadeFuncionarios + "\nSalário base dos funcionarios: R$" + 
        this.salarioBaseFuncionario + "\nEndereço: " + this.endereco + "\nData: " + this.dataFundacao + "\nMeta de vendas: " 
        + this.metaVendas;        
    }
}