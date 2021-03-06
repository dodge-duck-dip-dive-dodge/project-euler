package problems.solved.published;
/*
    Project Euler - Problem_009 - Solved by Rob Sutton on 03/07/2020
	    Answer : 31875000
	    Time Taken : 0.151799942 seconds
*/

import problems.ProblemSolver;

public class Problem_009 extends ProblemSolver {

    public Problem_009() {
        super("31875000");
    }

    @Override
    public String solve() {
        for (int i = 1; i < 1000; i++){
            for (int j = i; j < 1000; j++){
                for (int k = j; k < 1000; k++){
                    if (i*i + j*j == k*k || i*i + k*k == j*j || j*j + k*k == i*i){
                        if (i+j+k == 1000){ return Integer.toString(i*j*k); }

                    }
                }
            }
        }
        return "Error";
    }

}
