public class Data{
    
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        verificaDia();
    }
    
    public int getDia(){
        return this.dia;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getAno(){
        return this.ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public boolean verificaAnoBissexto(){
        if (getAno() % 4 == 0){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean verificaMes(){
        if (getMes() >= 1 && getMes() <= 12){
            return true;
        } else{
            return false;
        }
    }
    
    public void verificaDia(){
        if (verificaMes()){
            if(getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11){
                if(getDia() >= 1 && getDia() <= 30){
                    this.dia = getDia();
                    this.mes = getMes();
                    this.ano = getAno();
                }else{
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            } else if(getMes() == 2){
                if(verificaAnoBissexto()){
                    if(getDia() >= 1 && getDia() <= 29){
                        this.dia = getDia();
                        this.mes = getMes();
                        this.ano = getAno();
                    }
                    else{
                        this.dia = 1;
                        this.mes = 1;
                        this.ano = 2000;
                    }
                } else {
                    if(getDia() >= 1 && getDia() <= 28){
                        this.dia = getDia();
                        this.mes = getMes();
                        this.ano = getAno();
                    }
                    else{
                        this.dia = 1;
                        this.mes = 1;
                        this.ano = 2000;
                    }
                }
            } else{
                if(getDia() >= 1 && getDia() <= 31){
                    this.dia = getDia();
                    this.mes = getMes();
                    this.ano = getAno();
                }else{
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            }
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    
    }
    
    
    
    
    
    @Override
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}