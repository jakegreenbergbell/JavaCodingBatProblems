import sun.font.Script;

public class Runner {
    //your main containing tests and output
    public static void main(String[] args) {


//        System.out.println(nextMethod(true));
    }

    public boolean hasTeen(int a, int b, int c) {
        if ((a <= 19 && a >= 13) || (b <= 19 && b >= 13) || (c <= 19 && c >= 13)) {
            return true;
        } else {
            return false;
        }
    }

    public static String altPairs(String str) {
        String returner = "";
        boolean increment = false;
        int i = 0;
        while (i < str.length()) {
            returner += str.charAt(i);
            if (increment) {
                i = i + 3;
            } else {
                i++;
            }
            increment = !increment;
        }
        return returner;
    }

    public static String middleTwo(String str) {
        String returner = "";
        int half = str.length() / 2;
        returner += str.charAt(half - 1);
        returner += str.charAt(half);
        return returner;
    }

    public static int start1(int[] a, int[] b) {
        int amount = 0;
        if (a.length >= 1) {
            if (a[0] == 1) {
                amount += 1;
            }
        }
        if (b.length >= 1) {
            if (b[0] == 1) {
                amount += 1;
            }
        }
        return amount;
    }

    public static int greenTicket(int a, int b, int c) {
        int ticket = 0;
        if (a == b & b == c) {
            ticket = 20;
        }
        if (a == b && b != c) {
            ticket = 10;
        }
        if (a == c && b != c) {
            ticket = 10;
        }
        if (b == c && a != c) {
            ticket = 10;
        }
        if (a != b && b != c && a != c) {
            ticket = 0;
        }
        return ticket;
    }

    public static int blackjack(int a, int b) {
        int returner = 0;
        if (a <= 21 && b <= 21) {
            if ((21 - a < 21 - b)) {
                returner = a;
            } else {
                return b;
            }
        }
        if( a <= 21 && b > 21) {
            return a;
        }
        if( b <=  21 && a >21) {
            return b;
        }
        if(a> 21 && b >21){
            returner = 0;
        }
            return returner;
    }

    public static boolean bobThere(String str) {
        boolean returner = true;
        for (int i = 0; i <str.length(); i++) {
            Character char1 = str.charAt(i);
            Character char2 = ' ';
            if(str.length() > i + 2) {
                char2 = str.charAt(i + 2);
                if (char1 == 'b' && char2 == 'b') {
                    returner = true;
                    break;
                }
            } else {
                returner = false;
            }
        }
        return returner;

    }

    public static int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums[i] == val) && (nums[i + 1] != val) && (nums[i - 1] != val)) {
                int greatNum = 0;
                if ((nums[i + 1] > nums[i - 1]) || (nums[i+1] == nums[i-1])) {
                    greatNum = nums[i + 1];
                } else {
                    greatNum = nums[i - 1];
                }
                nums[i] = greatNum;
            }
        }
        return nums;
    }

    public static boolean equalIsNot(String str) {
        int notCounter = 0;
        int isCounter = 0;
        boolean returner = false;
        for (int i = 0; i <str.length() - 1; i ++){
            if((str.length() >= i + 2) && (str.charAt(i) == 'n') && (str.charAt(i + 1) == 'o') && (str.charAt(i + 2) == 't')){
                notCounter += 1;
            }
            if((str.length() >= i + 1) && (str.charAt(i) == 'i') && (str.charAt(i + 1) == 's')){
                isCounter += 1;
            }
        }
        if (notCounter == isCounter){
            returner =  true;
        }
        return returner;
    }

    public static boolean canBalance(int[] nums) {
        float totalValue = 0;
        float partValue = 0;
        for(int i = 0; i < nums.length; i++) {
            totalValue += nums[i];
        }
        for(int k = 1; k< nums.length; k++) {
            partValue = 0;
            for (int j = k; j < nums.length; j++) {
                partValue += nums[j];
                if (totalValue / 2 == partValue) {
                    return true;
                }
            }
        }
        return false;
    }
}
