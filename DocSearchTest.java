import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;
public class DocSearchTest{

    @Test
    public void testHandleUrl() throws URISyntaxException{
        URI url = new URI("http://localhost/");
        assertEquals("Don't know how to handle that path!" , url);
    }
}