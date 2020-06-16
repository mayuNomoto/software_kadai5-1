import java.util.Scanner;
import java.io.*;

public class IntToEng {
    // メインメソッド
    public static void main(String[] args) {
    	int input=0;
    	Scanner sc = new Scanner(System.in);
       try {
    	   while(sc.hasNext()) {
    		   input = sc.nextInt();
    		   if(input==-1) break;
    		   System.out.println(translateEng(input));
    		   
    	  }
       }
       catch(Exception e){
        	System.out.println("int型の範囲外です。");
        	System.out.println("異なる数字を入力してください。");
       }
        
        
    }

    // 数値を英訳する変換するメソッド
    //桁数で場合分けを行う
    static String translateEng(int n) {
    	String ans = null;
    		if(n<=19) {
    	
    		ans = solve1(n);
    	}
    	else if(n<100) {
    		ans = solve2(n);
    	}
    	else if(n<1000) {
    		ans = solve3(n);
    	}
    	else if(n<1000000) {
    		ans = solve4(n);
    	}
    	else if(n<1000000000) {
    		ans = solve5(n);
    	}
    	else if(n<=2147483647) {
    		ans = solve6(n);
    	}
    	
        return ans;
    }
    static String solve1(int n) {
    	if(n==0)return "zero";
    	else if(n==1)return "one";
    	else if(n==2)return "two";
    	else if(n==3)return "three";
    	else if(n==4)return "four";
    	else if(n==5)return "five";
    	else if(n==6)return "six";
    	else if(n==7)return "seven";
    	else if(n==8)return "eight";
    	else if(n==9)return "nine";
    	else if(n==10)return "ten";
    	else if(n==11)return "eleven";
    	else if(n==12)return "twelve";
    	else if(n==13)return "thirteen";
    	else if(n==14)return "forteen";
    	else if(n==15)return "fifteen";
    	else if(n==16)return "sixteen";
    	else if(n==17)return "seventeen";
    	else if(n==18)return "eighteen";
    	else if(n==19)return "nineteen";
    	else return null;
    	
    }
    static String solve2(int n) {
    	int b;//10の位の数
    	b=n/10;
    	String ans = null;
    	if(b == 2)ans="twenty";
    	if(b == 3)ans="thirty";
    	if(b == 4)ans="forty";
    	if(b == 5)ans="fifty";
    	if(b == 6)ans="sixty";
    	if(b == 7)ans="seventy";
    	if(b == 8)ans="eighty";
    	if(b == 9)ans="ninety";
    	int a;//1の位
    	a=n-10*b;
    	
			ans = ans +" "+ solve1(a);
		
			// TODO Auto-generated catch block
			
    	return ans;
    }
    static String solve3(int n) {
    	int c;//100の位の数
    	String ans = null;
    	c=n/100;
    	ans=translateEng(c)+" hundred";
    	if((n-c*100) != 0) {
    	ans = ans + " " +translateEng(n-c*100);
    	}
    	    	
    	return ans;
    	
    }
    static String solve4(int n) {
    	int d;//1000の位の数
    	String ans=null;
    	d=n/1000;
    	ans = translateEng(d)+" thousand";
    	if(n-d*1000 != 0) {
    	ans = ans + " " +translateEng(n-d*1000);
    	}
    	return ans;
    }
    static String solve5(int n){
    	int e;//1000000の位の数
    	String ans =null;
    	e=n/1000000;
    	ans= translateEng(e) +" million";
    	if(n-e*1000000 != 0) {
    	ans= ans +" "+ translateEng(n-e*1000000);
    	}
    return ans;
    	}
    static String solve6(int n) {
    	int f;//1000000000の位の数
    	String ans=null;
    	f=n/1000000000;
    	ans = translateEng(f) + " billion";
    	if(n-f*1000000000 != 0) {
    		ans = ans + " " + translateEng(n-f*1000000000);
    	}
     return ans;
}
}
