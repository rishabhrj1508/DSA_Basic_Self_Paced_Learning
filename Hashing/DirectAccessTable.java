class DAT{
    int[] table = new int[1000];

    void insert(int i){
        table[i] = 1;
    }

    void delete(int i){
        table[i] = 0;
    }

    int search(int i){
        return table[i];
    }
}

public class DirectAccessTable {
    public static void main(String[] args) {
        DAT dat = new DAT();
        dat.insert(10);
        dat.insert(20);
        dat.insert(119);

        System.out.println(dat.search(10));
        System.out.println(dat.search(20));

        dat.delete(119);

        System.out.println(dat.search(119));
    }
}