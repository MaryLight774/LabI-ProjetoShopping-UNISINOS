public class Vestuario extends Loja{
    
    protected boolean produtosImportados;
    
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, boolean produtosImportados, int qtdeMaxProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, qtdeMaxProdutos);
        this.produtosImportados = produtosImportados;
    }
    
    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data data, boolean produtosImportados, int qtdeMaxProdutos){
        super(nome, quantidadeFuncionarios, endereco, data, qtdeMaxProdutos);
        this.produtosImportados = produtosImportados;
    }
    
    public boolean getProdutosImportados(){
        return this.produtosImportados;
    }
    
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    
    @Override
    public String toString(){
        return "Nome da loja: " + this.nome + "\nQuantidade de funcionários: " + this.quantidadeFuncionarios + "\nSalário base dos funcionarios: R$" + 
        this.salarioBaseFuncionario + "\nEndereço: " + this.endereco + "\nData: " + this.dataFundacao + "\nProdutos importados: " 
        + this.produtosImportados;        
    }
}