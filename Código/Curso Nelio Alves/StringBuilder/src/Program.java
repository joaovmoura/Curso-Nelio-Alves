import entities.Comment;
import entities.Post;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Scanner sc = new Scanner(System.in);
        Comment c1 = new Comment("WOW! That's awesome!!!");
        Comment c2 = new Comment("Have a nice trip");
        Comment c3 = new Comment("Goog night!");
        Comment c4 = new Comment("May the force be with you :p");
        Post p1 = new Post(sdf.parse("13/01/2019 22:15:23"), "Travelling to New Zealand", "I'm going to visit this amazing country!!!", 13);
        p1.addComment(c1);
        p1.addComment(c2);

        Post p2 = new Post(sdf.parse("21/05/2020 23:35:18"),
                "Going to sleep!", "Good night guys, see u tomorrow!", 13);
        p2.addComment(c3);
        p2.addComment(c4);




    }
}
