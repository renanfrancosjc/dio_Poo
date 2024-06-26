package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.area.cozinha.Almoxarife;
import lanchonete.area.cozinha.Cozinheiro;

public class Estabeleciment {
    public static void main(String[] args){
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.lanchePronto();


        Atendente atendente = new Atendente();
        atendente.receberPedido();
        atendente.encaminharParaCozinha();

        Cliente cliente = new Cliente();
        cliente.realizarPedido();
        cliente.comer();

    }


}
