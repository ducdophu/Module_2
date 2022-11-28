package Demo._ss19.Vidu;

public class MainString {
    public static void main(String[] args) {
        String s = "Hello_I'm Java";
        System.out.println(s.substring(5));   //I'm Java
        System.out.println(s.substring(0, 5));//Hello
        StringBuilder sc = new StringBuilder("Hello");
        sc.reverse();
        System.out.println(sc);
    }
}
