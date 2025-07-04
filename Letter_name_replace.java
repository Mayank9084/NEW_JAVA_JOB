import java.util.Scanner;
public class Letter_name_replace {
    public static void main(String[] args) {
        System.out.print("Enter name : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.printf("Letter Before replace name : \n  \" Dear <|%s|> , Thanks a lot \" \n",str);
        System.out.print("Enter name you want to replace : ");
        String toReplace = sc.nextLine();
        System.out.print("Enter new name : ");
        String replacement = sc.nextLine();
        String updated = str.replace(toReplace,replacement);
        System.out.printf("Letter after replace name : \n  \" Dear <|%s|> , Thanks a lot \" ",updated);
    }
}
