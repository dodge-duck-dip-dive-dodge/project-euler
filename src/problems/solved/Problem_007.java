package problems.solved;

import problems.ProblemSolver;
import tools.numbers.primes.PrimeNumbers;

public class Problem_007 extends ProblemSolver {

    private PrimeNumbers Primes;

    public Problem_007() {
        super("104743");
    }

    @Override
    public void init() {
        this.Primes = new PrimeNumbers(123456); // Big enough that prime array is over 10001 in length
    }

    @Override
    public String solve() {
        int[] primes = this.Primes.getPrimeArray();
        int n = 10001;
        return Integer.toString(primes[n - 1]);
    }

    public void testProblem_007() {
        ProblemSolver Problem = new Problem_007();
        assert Problem.checkResult();
    }

}
