package JavaGame;
public class Enemy extends Character{
    String itemDrop;
    int goldDrop;
    public Enemy(String Name, int EXP, int LV, int HP, int AP, int Pwr, int Def, int Int, int Agl, String status, String Master, String itemDrop, int goldDrop) {
        super(Name, EXP, LV, HP, AP, Pwr, Def, Int, Agl, status, Master);
        this.itemDrop = itemDrop;
        this.goldDrop = goldDrop;
    }
    
    public String toString() {
        return "Name: "+getName()+"\nEXP: "+getEXP()+"\nLV:"+getLV()+"\nHP: "+getHP()+"\nAP: "+getAP()+"\nPwr: "+getPwr()+"\nDef: "+getDef()+"\nInt: "+getInt()+"\nAgl: "+getAgl()+"\nStatus: "+getStatus()+"Gold Dropped: "+goldDrop+"Item Dropped: "+itemDrop;
    }
}