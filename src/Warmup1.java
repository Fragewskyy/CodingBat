import java.util.Arrays;

public class Warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if ((weekday == false && vacation == false) || (weekday==false && vacation==true)){
            return true;
        }
        else if (weekday == true && vacation == false){
            return false;
        }
        return true;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile == bSmile == true) || (aSmile == bSmile == true)){
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if(a==b){
            return 2*(a+b);
        }
        return a+b;
    }

    public int diff21(int n) {
        if(n>21){
            return -2*(21-n);
        }
        return 21-n;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking) && (hour < 7 || hour > 20);
    }

    public boolean makes10(int a, int b) {
        return ((a==10 || b==10) ||(a+b==10));
    }

    public boolean nearHundred(int n) {
        return ((n>=90&&n<=110) || (n>=190&&n<=210));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        return ((a<0&&b>0&& !negative)||(a>0&&b<0&& !negative)||(a<0&&b<0&& negative));
    }

    public String notString(String str) {
        if (str.length()>=3){
            if (str.substring(0,3).equals("not")) {
                return str;
            }
            return "not"+" "+str;
        }
        return "not"+" "+str;
    }

    public String missingChar(String str, int n) {
        StringBuilder build = new StringBuilder(str);
        return build.deleteCharAt(n).toString();
    }

    public String frontBack(String str) {
        if(str.length()<=1) return str;
        String mid = str.substring(1,str.length()-1);
        return str.charAt(str.length()-1)+mid+str.charAt(0);


    }

    public String front3(String str) {
        if(str.length()>=3) return str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
        return str+str+str;

    }

    public String backAround(String str) {
        return str.charAt(str.length()-1)+str+str.charAt(str.length()-1);

    }

    public boolean or35(int n) {
        return (n%3==0 || n%5==0);
    }

    public String front22(String str) {
        if(str.length()>=2) return str.substring(0,2) + str + str.substring(0,2);
        return str+str+str;
    }

    public boolean startHi(String str) {
        if (str.length()>=2) return str.substring(0,2).equals("hi");
        return false;
    }
    public boolean icyHot(int temp1, int temp2) {
        return ((temp1<0&&temp2>100) || (temp1>100&&temp2<0));
    }
    public boolean in1020(int a, int b) {
        return ((a<=20 && a>=10)||(b<=20 && b>=10));
    }
    public boolean hasTeen(int a, int b, int c) {
        int[] teenRange = {13, 14, 15, 16, 17, 18, 19};
        return (Arrays.stream(teenRange).anyMatch(x -> x == a) || Arrays.stream(teenRange).anyMatch(x -> x == b) || Arrays.stream(teenRange).anyMatch(x -> x == c));
    }
    public boolean loneTeen(int a, int b) {
        return (a<=19&&a>=13 && b>19||b<13) || (b<=19&&b>=13 && a>19||a<13);
    }
    public String delDel(String str) {
        if(str.length()>=4 && str.substring(1,4).equals("del")) return str.replace("del", "");
        return str;
    }
    public boolean mixStart(String str) {
        if(str.length()>=3) return str.substring(1,3).equals("ix");
        return false;
    }
    public String startOz(String str) {
        if (str.length()>=2 && str.substring(0,2).equals("oz")){
            return "oz";
        }
        else if(str.length()>=2 && str.charAt(1)=='z'){
            return "z";
        }
        else if(str.length()>=1 && str.charAt(0)=='o'){
            return "o";
        }
        return "";

    }


}






