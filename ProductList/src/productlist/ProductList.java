
package productlist;

import java.util.ArrayList;

public class ProductList {

    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();

        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Macarrão");
        produtos.add("Leite");
        produtos.add("Café");

        System.out.println("Lista de Compras:");
        for (String produto : produtos) {
            System.out.println("- " + produto);
        }

        System.out.println("\nQuantidade total de produtos: " + produtos.size());
    }
    
}
