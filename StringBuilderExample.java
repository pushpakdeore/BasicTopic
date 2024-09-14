package Pushpak;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " ,");
        sb.delete(7, 9);
        System.out.println(sb.toString());
    }
}

