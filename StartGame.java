
public class StartGame {
  
  public static void main(String[] args) {
   
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    Player player2 = new Player();
    player2.setName("Issac");
    Sword sword1 = new Sword();
    sword1.setName("Excal");
    Sword sword2 = new Sword();
    sword2.setName("knife on a stick");
    
    System.out.println("Player1 name is: " + player1.getName());
    System.out.println("Player2 name is: " + player2.getName());
    System.out.println("Sword 1 is named: " + sword1.getSwordName());
    System.out.println("Sword 2 is named " + sword2.getSwordName());
    // this won't work until you create a getHealth method in your object. Uncomment it when you do.
    // System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
  }  
  
}