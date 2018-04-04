public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(String.class ,10);
        stack.push("asd");
        System.out.println(stack.remove());
        stack.push("aaa");
        stack.push("ll");
        System.out.println(stack.getSize());
        System.out.println(stack.freeSpaceLeft());
        stack.push("áá");
        stack.push("űű");
        System.out.println(stack.freeSpaceLeft());
        System.out.println(stack.remove());
    }
}
