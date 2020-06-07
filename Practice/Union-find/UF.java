/*
    CHAPTER 1:
*/
public class UF 
{
    private int[] id;  // access to component id (site indexed)
    private int count; // number of components
    
    public UF(int N)
    {
        count = N;
        id = new int[N];
        for (int i =0; i<N; i++)
        {
            id[i] = i;
        }
    }

    public int count()
    {   return count;   }

    public boolean connected(int p, int q)
    {   return find(p) == find(q);  }

    public int find(int p)

    /** Quick-find implementation */
    public int void union(int p, int q)
    {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i<id.length; i++)
        {
            if (id[i] == pid) {    id[i] == qid;   }
        }
        // Wrong implementation: if(id[i] == id[p])
    }
    /*
        change all entries which id[p] to id[q]
        (at most 2N + 2 array accesses)
    */

    public static void main(String[] args)
    {   // Solve dynamic connectivity problem on StdIn.
        int N = StdIn.readInt();            // Read number from sites.
        UF uf = new UF(N);                  // Init N components
        while (!StdIn.isEmpty())
        {
            int p = StdIn.readInt();        // Read pair to connect
            int q = StdIn.readInt();
            
            if (uf.connected(p,q))          // Ignore if connected
            {   continue;   }

            uf.union(p, q);                 // Combine components
            StdOut.println(p + " " + q);    // Print connection
        }
        StdOut.println(uf.count() + " components");
    }
}
