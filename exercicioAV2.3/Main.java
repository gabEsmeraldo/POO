public class Main{
    public static void main(String Args[]){
        //Produto[] produtos;
        int qntdProdutos = 0;
        double precoTotal = 0;
        Produto[] produtos[qntdProdutos++] = new ProdutoAlimenticio("Arroz", 8, "28/04/2026");
        //produtos[qntdProdutos++] = new ProdutoEletronico("Mouse", 100, 24);
        for(int i = 0; i <= qntdProdutos; i++){
            produtos[i].exibirInformacoes();
            double precoProduto = produtos[i].calcularPrecoFinal();
            precoTotal += precoProduto;
            System.out.println("Preco final: " + precoProduto);
        }
    }
}