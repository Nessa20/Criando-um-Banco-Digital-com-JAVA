public class ContaCorente extends Conta{

    public ContaCorente(Cliente cliente){
        super(cliente);
    }

   @Override
   public void imprimirExtrato(){
    System.out.println("=== Extrato conta corrente ===");
    super.imprimirInfosComuns();
   }

  
}