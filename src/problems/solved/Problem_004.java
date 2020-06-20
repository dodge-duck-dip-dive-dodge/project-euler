package problems.solved;

import problems.ProblemSolver;
import tools.numbers.types.PalindromeNumberType;

public class Problem_004 extends ProblemSolver {

    public Problem_004() {
        super("906609");
    }

    @Override
    public String solve() {
        for (int i = 1000; i > 950; i--){
            for (int j = i; j > 900; j--){
                PalindromeNumberType a = new PalindromeNumberType(i*j);
                if (a.isValid()){
                    return ( a.toString() );
                }
            }
        }
        return "Error";
    }

    public void testProblem_004() {
        ProblemSolver Problem = new Problem_004();
        assert Problem.checkResult();
    }

}