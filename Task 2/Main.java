import java.util.Scanner;

class Main {
  public static void main(String[] args){
    System.out.println("Please type your name below: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("Welcome " + name);

    System.out.println("Please type your age below: ");
    int age = scanner.nextInt();
    int retire = 67;
    if(retire - age == 1){
      System.out.println("You can expect retirement in: " + (retire - age) + (" year, have fun :)"));
    }else if(age >= retire){
      System.out.println("Congratulations on making it here alive, enjoy your retirement");
    }else{
    System.out.println("You can expect retirement in: " + (retire - age) + (" years, have fun :)"));
    }
  }
}
