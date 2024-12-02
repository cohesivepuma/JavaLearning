class book{
    String title;
    String author;
}

public class BooksTestDrive {
    public static void main(String[] args){
        book myBooks[] = new book[3];//we just declare a controller
        myBooks[0] = new book();//we need the real book!
        myBooks[1] = new book();
        myBooks[2] = new book();
        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while(x<3){
            System.out.println(myBooks[x].title+" by "+myBooks[x].author);
            x+=1;
        }
    }
}
