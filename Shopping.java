public class Shopping{
    
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    private int qtdeMaxLojas;
    private String tipoLoja;
    
    public Shopping(String nome, Endereco endereco, int qtdeMaxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdeMaxLojas];
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Endereco getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Loja[] getLojas(){
        return this.lojas;
    }
    
    public boolean insereLoja(Loja loja){
        int i;
        for(i=0; i<this.lojas.length; i++){
            if (this.lojas[i] == null){
                this.lojas[i] = loja;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeLoja(String nome){
        int i;
        for (i=0; i<this.lojas.length; i++){
            if(this.lojas[i] != null && this.lojas[i].getNome().equalsIgnoreCase(nome)){
                this.lojas[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public int quantidadeLojasPorTipo(String tipoLoja){
        int qtdeLojas = 0, i = 0;
        
        for (i=0; i<this.lojas.length; i++){ 
            if (tipoLoja.equalsIgnoreCase("Alimentação")){
                if(lojas[i] instanceof Alimentacao){
                    qtdeLojas++;
                }
            }
            if (tipoLoja.equalsIgnoreCase("Cosmético")){
                if(lojas[i] instanceof Cosmetico){
                    qtdeLojas++;
                }
            }
            if (tipoLoja.equalsIgnoreCase("Vestuário")){
                if(lojas[i] instanceof Vestuario){
                    qtdeLojas++;
                }
            }
            if (tipoLoja.equalsIgnoreCase("Bijuteria")){
                if(lojas[i] instanceof Bijuteria){
                    qtdeLojas++;
                }
            }
            if (tipoLoja.equalsIgnoreCase("Informática")){
                if(lojas[i] instanceof Informatica){
                    qtdeLojas++;
                }
            }
        }
        return qtdeLojas;
    }
    
    public Informatica lojaSeguroMaisCaro(){
        double valorMaximo = 0;
        Informatica lojaMaisCara = null;
        
        for (int i=0; i<this.lojas.length; i++){ 
            if (lojas[i] instanceof Informatica){
               Informatica informatica = (Informatica) lojas[i];
               double valorSeguro = informatica.getSeguroEletronicos();
               
               if (valorSeguro > valorMaximo){
                   valorMaximo = valorSeguro;
                   lojaMaisCara = informatica;
               }
               
            }
            
        }
        
        return lojaMaisCara;
    }

}