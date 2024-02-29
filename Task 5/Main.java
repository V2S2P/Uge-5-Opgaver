import java.util.ArrayList;
class Main{
  public static void main(String[] args){
    ArrayList<String> actions = new ArrayList<>();
    actions.add("0) Start game");
    actions.add("1) Resume game");
    actions.add("2) Pause game");
    actions.add("3) End game");

    GameMenu gameMenu = new GameMenu(actions);

    /*System.out.println("Displaying Menu:");
    gameMenu.displayMenu();
    */
    //gameMenu.getAction();

    String userChoice = gameMenu.getAction();
    int choice = Integer.parseInt(userChoice);

    doAction(choice);

    System.out.println("User choice: " + userChoice);
    //System.out.print(actions.get(2));


  }
  public static void doAction(int choice){
    switch (choice){
      case 0:
      System.out.println("Starting the game now");
      break;
      case 1:
      System.out.println("Fetching previously saved game data");
      break;
      case 2:
      System.out.println("Game paused");
      break;
      case 3:
      System.out.println("Ending game");
      break;
      default:
        System.out.println("Invalid choice.");
        break;
    }
  }
}
