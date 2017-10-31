import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class Classroom {

 Classroom classroom;

 @Before
 public void before(){
  this.classroom = new Classroom(20);
 }

 @Test
 public void testClassroomSetup(){
  assertEquals( 20, classroom.length() )
 }
}
