import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import static org.junit.Assert.*;
import org.junit.*;



public class DocSearchTest{
    
    @Test
    public void testHandleRequest() throws URISyntaxException, IOException{
        Handler h = new Handler("technical/");
        URI url = new URI("http://localhost/");
        URI search = new URI("/search?q=hello");
        URI dne = new URI("/gvhch");
        assertEquals("Don't know how to handle that path!" , h.handleRequest(dne));
        assertEquals("There were 0 files found." , h.handleRequest(search));
        assertEquals("There are " + h.files.size() + " files to search." , h.handleRequest(url));
    }


}