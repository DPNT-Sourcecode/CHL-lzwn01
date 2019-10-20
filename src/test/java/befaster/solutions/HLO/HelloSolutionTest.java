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
        assertThat(sum.compute(1, 1), equalTo("Hello world "));
    }
}
