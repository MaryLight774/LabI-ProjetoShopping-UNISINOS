public class Principal{
    
    private static int flag = 0;
    private Produto produto = null;
    private Loja loja = null;
    
     public static void main(String[] args){
         
       while(flag != 3){
           System.out.println("(1) criar uma loja\n" + "(2) criar um produto\n" + "(3) sair\n");
           flag = Teclado.leInt();
           switch (flag){
               case 1:
                   
                   break;

               case 2:
                   
                   break;
               
               case 3:
                   break;
               
               default:
                   System.out.println("Opção inválida\n");
           }
       }
                
    }
    
    
}