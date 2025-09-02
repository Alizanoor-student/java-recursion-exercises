//Print a string in reverse
public class Recursion2 {
    /*public static void printRev(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        printRev(str, str.length() - 1);
    }*/
    //Find the 1st and last occurrence of an element in string
    /*public static int first = -1;
    public static int last = -1;

    public static void findOccurrence(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurrence(str, idx+1, element);
    }

    public static void main(String[] args) {
        String str="abaacdaefaah";
        findOccurrence(str, 0, 'a');
    }*/
    //Check if an array is sorted (Strictly Increasing)
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            //Array is sorted till now
          return  isSorted(arr, idx+1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,3,5};
        System.out.println(isSorted(arr,0));
    }
}

