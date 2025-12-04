public class LastWordLen {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        String[] temp = s.split("\\s+");
        System.out.println(temp[temp.length-1].length());
    }
}
