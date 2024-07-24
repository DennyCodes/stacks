class Main {
  public static void main(String[] args) {
    Stack stack = new Stack(3);
    stack.push(10);
    stack.push(15);
    stack.push(20);
    System.out.println(stack);
    System.out.println(stack.pop());
    stack.push(25);
    System.out.println(stack);
    // TODO: Test your Stack implementation here!
  }
}