public class Sword {
  private String swordName;
  private int dmg;
  
  Sword() {
    this.dmg = 70;
  }
  public void setName (String swordName) {
     if (swordName.length() < 1) {
      this.swordName = "invalid";
      return;
    }
    
    this.swordName = swordName;
  }
    public String getSwordName() {
    return this.swordName;
  }
    public int getSDMG() {
      return this.dmg;
    }
}
