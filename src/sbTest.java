public class sbTest {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Tony");
        System.out.println(sb);
        //Char at index at 0
        System.out.println(sb.charAt(0));
        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);
        sb.insert(0,'S');
        System.out.println(sb);
        sb.insert(3,'n');
        System.out.println(sb);
        //delete the extra 'n;
        sb.delete(3,4);
        System.out.println(sb);
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("0");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
