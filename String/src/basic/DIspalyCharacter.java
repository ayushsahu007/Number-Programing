package basic;
//Program 1
public class DIspalyCharacter {
    public static void main(String[] args) {
        String str = "Program";
        for(int i = 0; i<str.length();i++){
            System.out.println(str.charAt(i)+"--------"+i);
        }
        char[] ch = str.toCharArray();
        for (int i = 0;i<ch.length;i++){
            System.out.println(ch[i]+"----------"+i);
        }
    }
}
