package scratchpad;

public class PracticeClient {

    public static void main(String[] args) {
        String s = "string";
        System.out.println(s);

        String t = pad(s, 8);
        System.out.println(t);
    }

    public static String pad(String s, int n) {
        return String.format("%" + n + "s", s);
    }

    }

