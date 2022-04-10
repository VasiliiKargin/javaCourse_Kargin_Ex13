import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        String str2 = "";
        str.insert(0, "RUB ");
        str.insert(4, "Российская Федерация ");
        str.append(147000000 + " ");
        str.append("Российский рубль ");
        str.append(1991 + " ");
        str.append("Москва ");
        str.append("Свердловская область ");
        str.append("Каргин Василий Сергеевич ");
        str.append("male ");
        str.append(1992 + " ");
        str.append(29 + " ");
        str.append("+79222221522 ");
        str.append("kups@mail.ru ");
        str.append(5000000.00 + " ");
        str.append("$");

       System.out.println(str);
        Pattern phoneNumber = Pattern.compile("\\+\\d{11}");
        //Pattern mail = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
        Matcher matcher = phoneNumber.matcher(str);
        while (matcher.find())
            str2 = matcher.group();
        StringBuilder ss = new StringBuilder(str2);
        ss.replace(3,10,"*******");
        System.out.println(ss);

        System.out.println(str);
        Pattern mail = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
        Matcher m= mail.matcher(str);
        while (m.find())
            str2=m.group();
        StringBuilder ss1 = new StringBuilder(str2);
        ss1.replace(0, ss1.indexOf("@"),"*****").replace(ss1.indexOf("@")+1, ss1.indexOf("."),"**" );
        System.out.println(ss1);

        String[] arr = str.toString().split(" ");
        String ss2="";
        for (int i=0;i< arr.length;i++){
            if (arr[i].length()>5)
                ss2 += arr[i]+ " ";
        }
        System.out.println(ss2);

    }
}
