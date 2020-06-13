import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.StdOut;

public class PercolationStats {

    // private int hits = 0;
    private double[] numberOfSites;
    private int gridSites = 0;

    // perform independent trials on an n-by-n grid
    public PercolationStats(int n, int trials)
    {
        if (n < 1 || trials < 1) {    throw new IllegalArgumentException();    }
        
        // Initialize the class variable
        numberOfSites = new double[trials];
        gridSites = n*n;

        // Run "trials" time, save data each time UF percolate
        for (int i = 0; i < trials; i++)
        {
            Percolation UF = new Percolation(n);
            while( !UF.percolates() )
            {
                int index = StdRandom.uniform(0, gridSites - 1);
                int row = index / n + 1;
                int col = index % n + 1;

                if(!UF.isOpen(row, col)){   UF.open(row, col);  }
            }

            numberOfSites[i] = UF.numberOfOpenSites() / (double)gridSites;
        }
    }

    // sample mean of percolation threshold
    public double mean()
    {
        return StdStats.mean(numberOfSites);
        // int length = numberOfSites.length;
        // double mean = 0;
        // for(int i = 0; i < length; i++)
        // {
        //     mean += numberOfSites[i];
        // }
        // return mean / length;
    }

    // sample standard deviation of percolation threshold
    public double stddev()
    {
        return StdStats.stddev(numberOfSites);
        // double mean = this.mean();
        // int length = numberOfSites.length;
        // double var = 0;
        // for (int i = 0; i < length; i++)
        // {
        //     var += (numberOfSites[i] - mean) * (numberOfSites[i] - mean);
        // }
        // var /= (length - 1);
        // return Math.sqrt(var);
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo()
    {
        double mean = this.mean();
        double stddev = this.stddev();
        int length = numberOfSites.length;

        return (mean - 1.96 * stddev / Math.sqrt(length));
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi()
    {
        double mean = this.mean();
        double stddev = this.stddev();
        int length = numberOfSites.length;

        return (mean + 1.96 * stddev / Math.sqrt(length));
    }

   // test client (see below)
   public static void main(String[] args)
   {
       if(args.length < 2)
       {   throw new IllegalArgumentException();   }

       int gridSize = 0;
       int trials = 0;

       try {
            gridSize = Integer.parseInt(args[0]);
            trials = Integer.parseInt(args[1]);   
        } finally {}

       PercolationStats test = new PercolationStats(gridSize, trials);
       StdOut.println("mean                    = " + test.mean());
       StdOut.println("stddev                  = " + test.stddev());
       StdOut.println("95% confidence interval = [" + test.confidenceLo() + ", " 
                      + test.confidenceHi() + "]");
   }
}
