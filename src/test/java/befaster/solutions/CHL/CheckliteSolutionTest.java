package befaster.solutions.CHL;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class CheckliteSolutionTest {

	private CheckliteSolution solution;
	
    @Before
    public void setUp() {

    	solution = new CheckliteSolution();
    }

    @Test
    public void checklite_Null() {
        assertThat(solution.checklite(null), equalTo(-1));
    }
}

