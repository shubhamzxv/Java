package Strings;
import java.util.ArrayList;
public class SubSequences {
    public static void main(String[] args) {
        ArrayList<String> ans = findSSQ("abc");
        for (String ss : ans) {
            System.out.print(ss + " ");
        }

        System.out.println();
        printSSQ("abc", " ");

        System.out.println();
        int[] arr = {2,4,5};
        sumSequenceArray(arr,0,0);
    }

    private static void sumSequenceArray(int[] arr, int indx , int sum) {  //find the sum of subSequences
        // base case
        if(arr.length==indx){
            System.out.print(sum+" ");
            return;

        }

        sumSequenceArray(arr,indx+1, sum + arr[indx]);
        sumSequenceArray(arr, indx+1, sum);
    }

    private static ArrayList<String> findSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if(s.isEmpty()){
            ans.add("");
            return ans;
        }

        ArrayList<String> smallAns = findSSQ(s.substring(1));

        for (String ss : smallAns) {

            ans.add(s.charAt(0) + ss);
            ans.add(ss);
        }
        return  ans;
    }

    private static void printSSQ(String s, String currAns) {
        if(s.isEmpty()){
            System.out.print(currAns);
            return;
        }
        String remString = s.substring(1);
        printSSQ(remString, currAns+ s.charAt(0));
        printSSQ(remString,currAns);

    }
}
