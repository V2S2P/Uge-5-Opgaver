class Main {
  public static void main(String[] args){
    Team A = new Team("De Uovervindelige");
    A.setRank(3);
    System.out.println(A.toString());

    Team B = new Team("Hash");
    B.setRank(4);
    System.out.println(B.toString());

    Team C = new Team("Lean");
    C.setRank(1);
    System.out.println(C.toString());

    Team D = new Team("Meth");
    D.setRank(2);
    System.out.println(D.toString());

    Team E = new Team("Coke");
    E.setRank(5);
    System.out.println(E.toString());
  }
}
