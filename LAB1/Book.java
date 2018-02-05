public class Book{
  //Attributes
   private String title;
   private int numofpage;
   private String authorName;

   //Constuctors
   public Book(){
   }
   public Book(String title){
    this.title = title;
   }
   public Book(String title,int numofpage){
    this.title = title;
    this.numofpage = numofpage;
   }
   public Book(String title,int numofpage,String authorName){
    this.title = title;
    this.numofpage = numofpage;
    this.authorName = authorName;
   }

   //Accessor 
            //setters
   
   public void settitle(String title){
    this.title = title;
   }

   public void setnumofpage(int numofpage){
    this.numofpage = numofpage;
   }

    public void setauthorName(String authorName){
    this.authorName = authorName;
   }

            //getters
   public String gettitle(){
    return this.title;
   }

   public int getnumofpage(){
    return this.numofpage;
   }

      public String getauthorName(){
    return this.authorName;
   }
   
  //Method
   public boolean compareBook(Book newBook) {
    return this.numberOfPage == newBook.numberOfPage && this.authorName == newBook.authorName;
  }

}