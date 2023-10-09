package Strings;

public class KeyPadCombinations {
    public static void main(String[] args) {
        String s = "236";
        String[] keyPad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        combinations(s,keyPad,"");
    }
    static void combinations(String dig, String[] keyPad, String result){  //253

        //base case
        if(dig.isEmpty()){
            System.out.print(result + " ");
            return;
        }

        //self work And recurence relation
        int currNum = dig.charAt(0)-'0'; //2
        String currChoices = keyPad[currNum];

        for (int i = 0; i <currChoices.length(); i++) {
            combinations(dig.substring(1),keyPad, currChoices.charAt(i)+result);
        }
    }
}
