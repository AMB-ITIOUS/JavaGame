package JavaGame;
public class Knight extends Character{
    public Knight(int EXP, int LV, int HP, int AP, int Pwr, int Def, int Int, int Agl, String Master) {
        super(EXP, LV, HP, AP, Pwr, Def, Int, Agl, Master);
    }
    public String toString() {
        return "EXP: "+getEXP()+"\nLV:"+getLV()+"\nHP: "+getHP()+"\nAP: "+getAP()+"\nPwr: "+getPwr()+"\nDef: "+getDef()+"\nInt: "+getInt()+"\nAgl: "+getAgl()+"\nMaster: "+getMaster();
    }
}
