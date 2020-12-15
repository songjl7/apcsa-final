import java.util.Random;

public class MedChar {
    private String type;
    private int strength;
    private int tough;
    private int intel;
    private int magic;
    private int influence;

    Random rand = new Random();

    public MedChar(String type){
        if (type.toLowerCase().equals("knight")){
            this.type = "knight";
            this.strength = rand.nextInt(4) + 7;
            this.tough = rand.nextInt(6);
            this.intel = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        } else if (type.toLowerCase().equals("peasant")){
            this.type = "peasant";
            this.strength = rand.nextInt(6);
            this.tough = rand.nextInt(4) + 7;
            this.intel = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        } else if (type.toLowerCase().equals("cleric")){
            this.type = "cleric";
            this.strength = rand.nextInt(6);
            this.tough = rand.nextInt(6);
            this.intel = rand.nextInt(4) + 7;
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        } else if (type.toLowerCase().equals("mage")){
            this.type = "mage";
            this.strength = rand.nextInt(6);
            this.tough = rand.nextInt(6);
            this.intel = rand.nextInt(6);
            this.magic = rand.nextInt(4) + 7;
            this.influence = rand.nextInt(6);
        } else if (type.toLowerCase().equals("courtier")){
            this.type = "courtier";
            this.strength = rand.nextInt(6);
            this.tough = rand.nextInt(6);
            this.intel = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(4) + 7;
        }
    }

    String[] types = {"knight", "peasant", "cleric", "mage", "courtier"};

    public MedChar() {
        this.type = types[rand.nextInt(4)];
        if (this.type.toLowerCase().equals("knight")){
            this.type = "knight";
            this.strength = rand.nextInt(4) + 7;
            this.tough = rand.nextInt(6);
            this.intel = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        } else if (this.type.toLowerCase().equals("peasant")){
            this.type = "peasant";
            this.strength = rand.nextInt(6);
            this.tough = rand.nextInt(4) + 7;
            this.intel = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        } else if (this.type.toLowerCase().equals("cleric")){
            this.type = "cleric";
            this.strength = rand.nextInt(6);
            this.tough = rand.nextInt(6);
            this.intel = rand.nextInt(4) + 7;
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        } else if (this.type.toLowerCase().equals("mage")){
            this.type = "mage";
            this.strength = rand.nextInt(6);
            this.tough = rand.nextInt(6);
            this.intel = rand.nextInt(6);
            this.magic = rand.nextInt(4) + 7;
            this.influence = rand.nextInt(6);
        } else if (this.type.toLowerCase().equals("courtier")){
            this.type = "courtier";
            this.strength = rand.nextInt(6);
            this.tough = rand.nextInt(6);
            this.intel = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(4) + 7;
        }
    }

    public int getStrength(){ return this.strength; }
    public int getTough(){ return this.tough; }
    public int getIntel(){ return this.intel; }
    public int getMagic(){ return this.magic; }
    public int getInfluence(){ return this.influence; }

    public String toString(){ return this.type + "," + String.valueOf(this.strength) + "," + String.valueOf(this.tough) + "," + String.valueOf(this.intel) + "," + String.valueOf(this.magic) + "," + String.valueOf(this.influence); }
}