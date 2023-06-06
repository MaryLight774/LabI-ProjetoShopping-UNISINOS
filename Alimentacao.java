public class Alimentacao extends Loja{
    
    protected Data dataAlvara;
    
    
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, Data dataAlvara, int qtdeMaxProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, qtdeMaxProdutos);
        this.dataAlvara = dataAlvara;
    }
    
    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco, Data data, Data dataAlvara, int qtdeMaxProdutos){
        super(nome, quantidadeFuncionarios, endereco, data, qtdeMaxProdutos);
        this.dataAlvara = dataAlvara;
    }
    
    public Data getDataAlvara(){
        return this.dataAlvara;
    }
    
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }
    
    @Override
    public String toString(){
        return "Nome da loja: " + this.nome + "\nQuantidade de funcionários: " + this.quantidadeFuncionarios + "\nSalário base dos funcionarios: R$" + 
        this.salarioBaseFuncionario + "\nEndereço: " + this.endereco + "\nData: " + this.dataFundacao + "\nData alvara: " 
        + this.dataAlvara;        
    }
}