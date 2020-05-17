import java.util.HashMap;
import java.util.Map;

public class ClFil {
    private String cl;
    private boolean used;
    private Map<Integer, FilFil> fil;

    public ClFil(){
        this.cl = "";
        this.used = false;
        this.fil = new HashMap<>();
        for (int i = 1; i<4 ; i++)
            this.fil.put(i, new FilFil());
    }

    public ClFil(String p){
        this.cl = p;
        this.used = false;
        this.fil = new HashMap<>();
        for (int i = 1; i<4 ; i++)
            this.fil.put(i, new FilFil());
    }

    public String getCl() {
        return this.cl;
    }

    public void setCl(String ID) {
        this.cl = ID;
    }

    public boolean getUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    /*
    public Map<Integer, FilFat> getPrd(){
        Map<Integer, FilFat> p = new HashMap<>();
        Set <Map.Entry<Integer, FilFat>> aux = prod.entrySet();
        for ( Map.Entry<Integer,FilFat> aux2: aux )
            p.put(aux2.getKey(),aux2.getValue());

        return p;
    }
*/

    public Map<Integer, FilFil> getFil(){
        return this.fil;
    }

    public boolean getMesUsed( int f, int m){
        return fil.get(f).getFilF().get(m).isUsed();
    }


}

