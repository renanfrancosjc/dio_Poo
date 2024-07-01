public class Lista{
    public static void main(String [] args){
        List<String> listaGen = new ArrayList<>();

        listaGen.add("elemento1");
        listaGen.add("elemento2");

        for(String elemento : listaGen){
            System.out.println(elemento);
        }
    }
}