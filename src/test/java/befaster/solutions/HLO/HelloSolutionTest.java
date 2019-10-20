package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HelloSolutionTest {

	private HelloSolution helloMessage;
	
    @Before
    public void setUp() {
    	helloMessage = new HelloSolution();
    }
	
    
    @Test
    public void hello_Null() {
        assertThat(helloMessage.hello(null), equalTo("Hello, null!"));
    }
    
    @Test
    public void hello_Empty() {
        assertThat(helloMessage.hello(""), equalTo("Hello, !"));
    }
    
    @Test
    public void hello_Normal() {
        assertThat(helloMessage.hello("Viktor"), equalTo("Hello, Viktor!"));
    }
}
