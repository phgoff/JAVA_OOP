public class Main{

 public static void main(String[] args){
    Book mybook1,mybook2;

    mybook1 = new Book();
    mybook2 = new Book("PHP Programming");
    
    mybook1.settitle("Java Programming");

    System.out.println("Book1 and Book2 is the same Book: "+ mybook1.compareBook(mybook2));
    System.out.println("Book1 Title:"+ mybook1.gettitle()+"\nBook2 Title:"+mybook2.gettitle());
   }
}   
