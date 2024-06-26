package lanchonete.area.cozinha;

public class Cozinheiro {
    private void preparaLanche(){
        System.out.println("Preparando lanche");
    }

    private void prepararCarne(){
        System.out.println("Carne na brasa");
    }

    public void lanchePronto(){
        System.out.println("Plim-Plim");
    }

    public void trocarIngredientes(Almoxarife almoxarife){
        almoxarife.controlarIngredientes();
    }
}
