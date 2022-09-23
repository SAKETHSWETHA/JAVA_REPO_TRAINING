package StringsandArrays_Sept14th;

public class SetRegion {
    public static void main(String[] args) {
            String str1 = "Alphabet is parent company of Google";
            String str2 = "Alphabet is 4th most valued company and Alphabet is parent company of Google";

            System.out.println(str1.length());
            System.out.println(str2.lastIndexOf("Alphabet"));
            System.out.println(str1.regionMatches(0,str2,40,36));


        }
    }

