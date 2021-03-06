package Model;

import java.util.Collection;
import java.util.TreeSet;


public interface InterfaceProdutos {

    void  addProduto(String p);
    void rmProduto(String p);
    Collection<String> prodStartedByLetter(char l);
    int size();
    boolean existe(String s);
    int ler_produtos(String filepath) throws Exception;
    TreeSet<String> getSetDeProdutos();
    Produtos3 clone();
    //TreeSet<String> getP(int i);


}