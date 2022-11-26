public class SearchingInString {
    public static void main(String[] args) {
        String s = "Rishabh";
        char target = 'A';
        System.out.println(search(s,target));

        
    }

    static boolean search(String str , char target){
        if (str.length()==0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;

    }
    
}
