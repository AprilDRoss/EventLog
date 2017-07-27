import com.example.Event;
import com.example.EventLog;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AddEventMethodTest {

    @Rule
            ExpectedException expected = ExpectedException.none();

    @Test

    public void nullEventParameter () throws Exception{
        System.out.println("Testing for null addEvent parameters");
        EventLog myEventLog  = new EventLog();
        thrown.expect(IllegalArgumentException.class);
        boolean result = EventLog.addEvent(Event);





    }

}
