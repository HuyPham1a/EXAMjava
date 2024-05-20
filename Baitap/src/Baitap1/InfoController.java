package Baitap1;

import java.util.ArrayList;
import java.util.Scanner;

public class InfoController {
    ArrayList<Info> info = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void createInfo() {
        System.out.println("Enter info ID");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter article Title: ");
        String articleTitle = sc.nextLine();
        System.out.println("Enter describe: ");
        String describe = sc.nextLine();
        System.out.println("Enter avatar(You can enter the link or URL): ");
        String avatar = sc.nextLine();
        System.out.println("Enter writer: ");
        String writer = sc.nextLine();
        System.out.println("Enter date of writing: ");
        String date = sc.nextLine();
        Info ifo = new Info();
        info.add(ifo);
        ifo.setArticleTitle(articleTitle);
        ifo.setDescribe(describe);
        ifo.setAvatar(avatar);
        ifo.setWriter(writer);
        ifo.setDateofwriting(date);
        System.out.println("Saved successfully");
    }
    public void showInfo(){
        System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", "Id", "Article title", "describe", "avatar", "writer", "date of writing");
        for (int i = 0; i < info.size(); i++) {
           Info ifo = info.get(i);
            System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", ifo.getId(), ifo.getArticleTitle(), ifo.getDescribe(), ifo.getAvatar(), ifo.getWriter(), ifo.getDateofwriting());
        }
        System.out.println("Press Enter to continue.");
        sc.nextLine();
    }
}
