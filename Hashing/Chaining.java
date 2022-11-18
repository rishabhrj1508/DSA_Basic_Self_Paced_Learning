import java.util.*; 

class MyHash
{
    int BUCKET;
    ArrayList<LinkedHashSet<Integer>> table;
    MyHash(int b)
    {
        BUCKET = b;
        table = new ArrayList<LinkedHashSet<Integer>>();
        for (int i=0; i<b; i++)
           table.add(new LinkedHashSet<Integer>());
    }
    void insert(Integer k)
    {
        int i = k % BUCKET;
        table.get(i).add(k);
    }
    boolean search(Integer k)
    {
        int i = k % BUCKET;
        return table.get(i).contains(k);
    }
    void delete(Integer k)
    {
        int i = k % BUCKET;
        table.get(i).remove(k);
    }
}

class Chaining
{
	// Driver method to test Map class 
	public static void main(String[] args) 
	{ 
	    MyHash mh = new MyHash(7);
	    mh.insert(10);
	    mh.insert(20);
	    mh.insert(15);
	    mh.insert(7);
	    System.out.println(mh.search(10));
	    mh.delete(15);
	    System.out.println(mh.search(15));
	} 
} 
