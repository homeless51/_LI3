import java.util.Collection;
import java.util.TreeSet;

public interface InterfaceClientes {

    void addCliente(String cl);
    void rmCliente(String cl);
    Collection<String> clStartedByLetter(char l);
    int ler_clientes(String filepath) throws Exception;
    int size();
    boolean existe(String s);
    TreeSet<String> getC(int i);

}

