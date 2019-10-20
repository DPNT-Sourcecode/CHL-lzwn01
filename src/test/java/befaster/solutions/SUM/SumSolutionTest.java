package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void compute_sum_Negative_Negative(){
    	sum.compute(-1, -1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void compute_sum_Negative_Positive(){
    	sum.compute(-1, 1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void compute_sum_Positive_Negative(){
    	sum.compute(1, -1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void compute_sum_Normal_Over100(){
    	sum.compute(1, 101);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void compute_sum_Over100_Normal(){
    	sum.compute(101, 10);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void compute_sum_Over100_Over100(){
    	sum.compute(101, 101);
    }
}

