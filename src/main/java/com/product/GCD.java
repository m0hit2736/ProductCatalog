package com.product;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCD gcd=new GCD();
		String gcdRes=gcd.gcdOfStrings("ABCABC", "ABC");
		System.out.print(gcdRes);

	}

	    public String gcdOfStrings(String str1, String str2) {
	        String sol = str1.length() <= str2.length() ? str1 : str2;
	        int len = str1.length() <= str2.length() ? str2.length() : str1.length();
	        String gcd = "";
	        for (int i = 1; i < sol.length(); i++) {
	            int j = 0;
	            int k = i;
	            while (k <= len) {
	                if (str1.substring(j, k).equals(sol.substring(0, i))) {
	                    j = k;
	                    k = k + i;
	                    gcd = sol.substring(0, i);
	                } else {
	                    gcd = "";
	                    break;
	                }
	                j=0;
	                k=i;
	                if (k <= str2.length()) {
	                    if (str2.substring(j, k).equals(sol.substring(0, i))) {
	                        j = k;
	                        k = k + i;
	                        gcd = sol.substring(0, i);
	                    } else {
	                        gcd = "";
	                        break;
	                    }
	                }
	            }
	        }
	        return gcd;
	    }
}
