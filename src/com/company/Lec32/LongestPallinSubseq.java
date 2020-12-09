package com.company.Lec32;

public class LongestPallinSubseq {

    public static void main(String[] args) {

        String s = "acabada";
        System.out.println(LPS(s,0,s.length()-1));

        int[][] mem = new int[s.length()][s.length()];

        System.out.println(LongestpallinseqITR(s,0,s.length()-1,mem));
    }

    public static int LPS(String s, int start, int end){

        if(start>end){
            return 0;
        }

        if(start==end){
            return 1;
        }


        if(s.charAt(start) == s.charAt(end)){

            return 2+ LPS(s,start+1,end-1);
        }

        else{
            return Math.max(LPS(s,start+1,end),LPS(s,start,end-1));
        }
    }


    public static int LPSDP(String s, int start, int end, int [][] mem){

        if(start>end){
            return 0;
        }

        if(start==end){
            return 1;
        }

        if(mem[start][end]!=0){
            return mem[start][end];
        }

        if(s.charAt(start) == s.charAt(end)){

            mem[start][end]=  2+ LPSDP(s,start+1,end-1,mem);
        }

        else{
            mem[start][end]= Math.max(LPSDP(s,start+1,end,mem),LPSDP(s,start,end-1,mem));
        }

        return mem[start][end];
    }

    public static int LongestpallinseqITR(String s, int start, int end, int[][] mem){


        for (int di = 0; di < s.length() ; di++) {

            for (int si = 0; si <=s.length()-di-1 ; si++) {

                int ei = si+ di;

                if(si==ei){

                    mem[si][ei]= 1;
                }

                else{

                    if(s.charAt(si)== s.charAt(ei)){

                        mem[si][ei] = 2+ mem[si+1][ei-1];
                    }

                    else{
                        mem[si][ei] = Math.max(mem[si+1][ei],mem[si][ei-1]);
                    }
                }
            }
        }

        return mem[start][end];
    }



}
