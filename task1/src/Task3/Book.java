package Task3;

import java.util.Scanner;

public class Book {


    public static void main(String[] args) {
        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        String authorName;
        String nameTitle;
        String contentText;

        author.show();
        title.show();
        content.show();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter name author: ");
        authorName = input.nextLine();
        System.out.print("Enter title: ");
        nameTitle = input.nextLine();
        System.out.print("Enter short content: ");
        contentText = input.nextLine();
        input.close();

        author.setName(authorName);
        title.setTitle(nameTitle);
        content.setContent(contentText);

        author.show();
        title.show();
        content.show();
    }
}
