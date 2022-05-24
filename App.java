class App {
  public static void main(String args[]){
    App.forLoop();
    App.whileLoop();
    App.doWhileLoop();
  }

  private static void forLoop() {
    for(int i = 10; i >= 0; i--) {
      if (i == 0) {System.out.println("Launch!");
    } else {
        System.out.println(i);
      };
    }
  }
  private static void whileLoop() {
    int i = 0;
    while(i < 5) {
      System.out.println("I love Java");
      i++;
    }
  }
  private static void doWhileLoop() {
    int i = 0;
    do {
      System.out.println("I love Java");
      i++;
    } while (i < 5);
  }
}
