package Pushpak;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, " ,");
        sb.insert(5, " p");
        sb.delete(5, 6);
        System.out.println(sb.toString());
    }
}

