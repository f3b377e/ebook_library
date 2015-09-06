import java.util.Vector;

/**
 * @author Francesco
 * Created by Francesco on 06/09/2015.
 */
public class Library {
    private Vector<Book> collection;

    public Library(){
        collection = new Vector<>();
    }
    public void addBook(Book book){
        collection.add(book);
    }
    public Vector<Book> getCollection(){
        return collection;
    }
    public void stamp(){
        int i = 1;
        System.out.println("###### EBOOK LIBRARY ######");
        for (Book b:collection){
            System.out.println("\n# Book n."+i++ +b.toString());
        }
    }
}