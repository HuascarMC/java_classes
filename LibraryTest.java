import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class LibraryTest{

 Library libary;

 @Before
 public void before(){
  this.library = new Books(20);
 }

}
