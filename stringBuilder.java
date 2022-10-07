
/*
Program: Compare string builder and string Buffer using performance test
@author Sayantan ghosh
@date 6th oct 2022
*/
public class stringBuilder {

    public static void StrConcat(String str1) {
        str1 = str1 + "Edureka";
    }

    public static void StrBufConcat(StringBuffer str2) {
        str2.append("Edureka");
    }

    public static void StrBuildConcat(StringBuilder str3) {
        str3.append("Edureka");
    }

    public static void main(String[] args) {
        String str1 = "Hello!";
        StrConcat(str1);
        System.out.println("The final String is - " + str1);

        StringBuffer str2 = new StringBuffer("Hello!");
        StrBufConcat(str2);
        System.out.println("The final String is - " + str2);

        StringBuilder str3 = new StringBuilder("Hello!");
        StrBuildConcat(str3);
        System.out.println("The final String is -" + str3);
    }
}