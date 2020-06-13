import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Percolation {
    // Inits class attribute
    private int toproot = 0;
    private int bottomroot = 0;
    private int opensite = 0;

    private int Gridlength;
    private WeightedQuickUnionUF UF;
    private boolean[] sites;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n)
    {
        if (n < 1) {    throw new IllegalArgumentException();   }
        Gridlength = n;
        UF = new WeightedQuickUnionUF(n*n + 2);
        toproot = n*n;
        bottomroot = n*n + 1;

        sites = new boolean[n*n + 2]; // all sites are closed
        sites[toproot] = true;
        sites[bottomroot] = true;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col)
    {   
        // check for 
        check(row, col);
        if (isOpen(row, col)) {   return;  }

        int cur_site = index(row, col);
        
        // Top
        if (row == 1) {    UF.union(toproot, cur_site);    }
        else
        {
            int toprow = row - 1;
            tryUnion(toprow, col, cur_site);
        }

        // Bottom
        if (row == Gridlength) {    UF.union(bottomroot, cur_site);    }
        else
        {
            int botrow = row + 1;
            tryUnion(botrow, col, cur_site);
        }

        // Left
        if (col != 1) 
        {
            int leftcol = col - 1;
            tryUnion(row, leftcol, cur_site);
        }

        // Right
        if (col != Gridlength)
        {
            int rightcol = col + 1;
            tryUnion(row, rightcol, cur_site);
        }

        opensite += 1;
        sites[cur_site] = true;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col)
    {
        check(row,col);

        int index = index(row, col);
        return sites[index];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col)
    {
        check(row,col);
        int index = index(row, col);

        return UF.connected(index, toproot);
    }

    // returns the number of open sites
    public int numberOfOpenSites()
    {   return opensite;    }

    // does the system percolate?
    public boolean percolates()
    {   return UF.connected(toproot, bottomroot);   }

    /*--------------------Helpers function--------------------*/

    // Union the adjacent sites with the current site if the sites are open
    private void tryUnion(int row, int col, int cursite)
    {
        if (isOpen(row, col))
        {
            int index = index(row, col);
            UF.union(index, cursite);
        }
    }

    // returns the index of the UF from sites[row][col]
    private int index(int row, int col)
    {
        return Gridlength*(row-1) + (col -1);
    }

    // checks if the both the row and col are valid
    private void check(int row, int col)
    {
        if (row < 1 || row > Gridlength || col < 1 || col > Gridlength)
        {   throw new IllegalArgumentException();   }
    }
    // test client (optional)
    // public static void main(String[] args)
    // {
    //     Percolation test = new Percolation(10);
    //     for (int i = 0; i< 9; i++)
    //     {
    //         test.open(i+1, 4);
    //     }
    //     StdOut.println(test.percolates());
    //     StdOut.println(test.numberOfOpenSites());
    // }

}