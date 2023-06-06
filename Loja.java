public class Loja{
    
    protected String nome;
    protected int quantidadeFuncionarios;
    protected double salarioBaseFuncionario;
    protected Endereco endereco;
    protected Data dataFundacao;
    protected Produto[] estoqueProdutos;
    protected int qtdeMaxProdutos;
    
    
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, int qtdeMaxProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = data;
        this.estoqueProdutos = new Produto[qtdeMaxProdutos];
    }
    
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data data, int qtdeMaxProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
        this.endereco = endereco;
        this.dataFundacao = data;
        this.estoqueProdutos = new Produto[qtdeMaxProdutos];
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return this.quantidadeFuncionarios;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return this.salarioBaseFuncionario;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Data getDataFundacao(){
        return this.dataFundacao;
    }
    
    public void setDataFundacao(Data data){
        this.dataFundacao = data;
    }
    
    public Produto[] getEstoqueProdutos(){
        return this.estoqueProdutos;
    }
    
    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }
    
    

    @Override
    public String toString(){
        return "Nome da loja: " + this.nome + "\nQuantidade de funcionários: " + this.quantidadeFuncionarios 
        + "\nSalário base dos funcionarios: R$" + this.salarioBaseFuncionario + "\nEndereço: " + this.endereco + "\nData: " 
        + this.dataFundacao + "\nEstoque de produtos: " + this.estoqueProdutos + "\nQuantidade máxima de produtos: " + this.qtdeMaxProdutos;        
    }
    
    public double gastosComSalario(){
        if (getSalarioBaseFuncionario() == -1.0){
            return -1.0;
        } else{
            return getSalarioBaseFuncionario()*getQuantidadeFuncionarios();
        }
    }
    
    public char tamanhoDaLoja(){
        if (this.quantidadeFuncionarios < 10){
            return 'P';
        } else if(this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30){
            return 'M';
        } else {
            return 'G';
        }
    }
    
    public void imprimeProdutos(){
        int i;
        for (i=0; i<estoqueProdutos.length; i++){
            System.out.println(this.estoqueProdutos[i].toString());
        }
    }
    
    public boolean insereProduto(Produto produto){
        int i;
        for (i=0; i<estoqueProdutos.length; i++){
            if (this.estoqueProdutos[i] == null){
                this.estoqueProdutos[i] = produto;
                return true;
            }
        }
        
        return false;
    }
    
    public boolean removeProduto(String nome_produto){
        int i;
        for (i=0; i<estoqueProdutos.length; i++){
            if (this.estoqueProdutos[i].getNome() != null && this.estoqueProdutos[i].getNome().equalsIgnoreCase(nome_produto)){
                this.estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
    
}