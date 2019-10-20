package befaster.solutions.CHL;

import com.google.common.base.Strings;

import befaster.runner.SolutionNotImplementedException;

public class CheckliteSolution {
    public Integer checklite(String skus) {
    	if(Strings.isNullOrEmpty(skus) || skus.length() > 1 || !skus.equals(skus.toUpperCase())){
    		return -1;
    	}
    	return 0;
    }
}

