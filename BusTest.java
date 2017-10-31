import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BusTest{

 Bus bus;

 @Before
 public void before(){
  this.bus = new Bus(20);
 }

 @Test
 public void testBusSetup(){
  assertEquals( 20, bus.getCapacity() );
 }
}
