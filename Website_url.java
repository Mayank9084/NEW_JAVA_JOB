import java.util.Scanner;
public class Website_url {
    public static void main(String[] args) {
        System.out.println("Enter your website : ");
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println("Its an Commercial website");
        } else if (website.endsWith(".org")) {
            System.out.println("Its an Organization website");
        } else if (website.endsWith(".in")) {
            System.out.println("Its an Indian website");
        } else {
            System.out.println("Input Invalid");
        }
        System.out.println("""
                                
                ░░░░░░░░▄▄▄██████▀▀██████▄▄▄░░░░░░░░
                ░░░░▄███▀█▄░░░░░▄░░▄░░░░░▄█▀███▄░░░░
                ░░██▀█▄████░░░░░████░░░░░████▄█▀██░░
                ▄█▀▄███████▄▄░▄▄████▄▄░▄▄███████▄▀█▄
                ██░██████████████████████████████░██
                ██░██████████████████████████████░██
                ▀██▀████▀░▀▀█▀░▀▀██▀▀░▀█▀▀░▀████▀██▀
                ░░██▄█▀█▄░░░░░░░░▀▀░░░░░░░░▄█▀█▄██░░
                ░░░░▀███▄▄▄░░░░░░░░░░░░░░▄▄▄███▀░░░░
                ░░░░░░░░▀▀▀██████████████▀▀▀░░░░░░░░
                                
                """);
    }
}
