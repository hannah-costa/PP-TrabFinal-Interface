package teste;
import java.util.ArrayList;

public class CestaCompras {
    private ArrayList<ItemCesta> itens;

    public CestaCompras() {
        itens = new ArrayList();
    }
    
    //MÉTODO GETTER
    
    protected ArrayList<ItemCesta> getItens() {
        return itens;
    }
    
    
    protected boolean add(ItemCesta item, Produto produto){
        //Esse método recebe o ItemCesta a ser adicionado e o Produto referente a ele
        //para verificar se é possível colocar a quantidade pedida (comparar com estoque) dentro do carrinho.
    
        if (item.getQtdPedida() <= produto.getQuant()){
            itens.add(item);
            return true;
        }
        return false;
    }
    
    protected void remover(ItemCesta item){
        for (int i=0; i<itens.size(); i++){
            if (itens.get(i) == item){
                itens.remove(i);
            }
        }
    }
    
    protected double calcTotal(){
        double total = 0;
        for (ItemCesta x : itens){
            total += x.getPreco() * x.getQtdPedida();
        }
        return total;
    }
    
    protected ArrayList efetuarCompra(ArrayList<Produto> produtosCtlg){
        //baixar estoque e retornar o ArrayList com os itens.
        for (int i=0; i<itens.size(); i++){
            for (int j=0; j<produtosCtlg.size(); j++){
                if (itens.get(i).getId() == produtosCtlg.get(j).getId()){
                    produtosCtlg.get(j).setQuantidade(itens.get(i).getQtdPedida());
                }
            }
        }
        return itens;
    }
    
    protected void printCesta(){
        for(int i=0; i < itens.size(); i++){
            System.out.print("Nome: ");
            for (String nome : itens.get(i).getNome()) {
                System.out.print(nome + " ");
            }
            System.out.println("Quantidade:" + itens.get(i).getQtdPedida());
            System.out.println("Preco unitário: " + itens.get(i).getPreco());
            System.out.println("Numero do produto: "+ itens.get(i).getId());
            System.out.println("");
        }
    }   
}