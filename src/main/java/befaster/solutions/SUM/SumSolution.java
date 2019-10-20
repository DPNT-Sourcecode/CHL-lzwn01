package befaster.solutions.SUM;

import java.util.Optional;

import befaster.runner.SolutionNotImplementedException;

@SuppressWarnings("unused")
public class SumSolution {

    public synchronized int compute(int x, int y) {
    	if(x < 0 || x >= 100 || y < 0 || y >= 100){
    		throw new IllegalArgumentException("Please input only the allowed variable values");
    	}
        return x + y;
    }

}
