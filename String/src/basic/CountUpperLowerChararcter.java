package basic;
//Program 2
public class CountUpperLowerChararcter {
    public static void main(String[] args) {
        String str = "Welcome To Jspider";
        int ucc = 0; //upper case character
        int lcc = 0; //lower case character
        for (int i = 0;i<str.length();i++){
              if(str.charAt(i)>='A' && str.charAt(i) <= 'Z' )
                  ucc++;
              else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                  lcc++;
        }
        System.out.println("UpperCase Count = "+ucc);
        System.out.println("LowerCase Count= "+lcc);

    }
}
