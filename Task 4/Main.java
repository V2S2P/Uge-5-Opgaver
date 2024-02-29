import java.util.ArrayList;
class Main{
  public static void main(String[] args){
    ArrayList<String> actions = new ArrayList<>();
    actions.add("0) Start game");
    actions.add("1) Resume game");
    actions.add("2) Pause game");
    actions.add("3) End game");

    GameMenu gameMenu = new GameMenu(actions);

    System.out.println("Displaying Menu:");
    gameMenu.displayMenu();

    

    //System.out.print(actions.get(2));
  }
}


/*for(int i = 0; i < actions.size(); i++){
  System.out.println(actions.get(i));
}*/
