import java.lang.String;
public class Entity {

    //logo quiz
    //algo/sort display

    //class variables
    private int supply;
    private String timestamp;
    private int entity_id;
    private int quantity;

    //default constructor and one with all variables
    public Entity () {
        this.supply = 12;
        this.timestamp = "00:00";
        this.entity_id = 0;
        this.quantity = 1;
    }

    public Entity (int s, String ts, int id,int q) {
        this.supply = s;
        this.timestamp = ts;
        this.entity_id = id;
        this.quantity = q;
    }

    //public facing class variable access (getters)
    public int getSupply() { return supply; }

    public String getTimestamp() { return timestamp; }

    public int getEntityID() { return entity_id; }

    public int getQuantity() { return quantity; }

    public String consolePrint() {
        Conversion c = new Conversion();
        return supply + " " + timestamp + " " + c.getEntityString(entity_id) + " x" + quantity + "\n";
    }
}