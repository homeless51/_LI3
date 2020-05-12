import java.util.HashMap;
import java.util.Map;

public class Fil {
    private int used;
    private Map<Integer, MesFat> filial;

    public Fil(){
        this.used = 0;
        this.filial = new HashMap<>();
        for (int i = 1; i<13 ; i++)
            this.filial.put(i, new MesFat());
    }


    public int getUsed() {
        return this.used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public void incUsed(){
        this.used += 1;
    }

    public Map<Integer,MesFat> getFilF(){
        return this.filial;
    }
}