package com.company.Lec32;

public class EditDistance {

    public static void main(String[] args) {

        String s1 = "dogssss";
        String s2 = "doggg";
        System.out.println(EditDistanceRec(s1, s2));

        Integer[][] mem = new Integer[s1.length() + 1][s2.length() + 1];
        System.out.println(EditDistanceItr(s1, s2, mem));
    }


    public static int EditDistanceRec(String s1, String s2) {

        if (s1.length() == 0) {
            return s2.length();
        }

        if (s2.length() == 0) {
            return s1.length();
        }

        char f = s1.charAt(0);
        char s = s2.charAt(0);

        if (f == s) {

            return EditDistanceRec(s1.substring(1), s2.substring(1));
        } else {

            return 1 + Math.min(EditDistanceRec(s1.substring(1), s2),
                    Math.min(EditDistanceRec(s1.substring(1)
                            , s2.substring(1)), EditDistanceRec(s1, s2.substring(1))));
        }
    }

    public static int EditDistanceRecDP(String s1, String s2, Integer[][] mem) {

        if (s1.length() == 0) {
            return s2.length();
        }

        if (s2.length() == 0) {
            return s1.length();
        }


        if (mem[s1.length()][s2.length()] != null) {

            return mem[s1.length()][s2.length()];
        }

        char f = s1.charAt(0);
        char s = s2.charAt(0);

        if (f == s) {

            mem[s1.length()][s2.length()] = EditDistanceRecDP(s1.substring(1), s2.substring(1), mem);
        } else {

            mem[s1.length()][s2.length()] = 1 + Math.min(EditDistanceRecDP(s1.substring(1), s2,mem),
                    Math.min(EditDistanceRecDP(s1.substring(1)
                            , s2.substring(1),mem), EditDistanceRecDP(s1, s2.substring(1),mem)));
        }

        return mem[s1.length()][s2.length()];
    }


    public static int EditDistanceItr(String s1, String s2, Integer[][] mem) {

        for (int i = 0; i <= s1.length(); i++) {

            for (int j = 0; j <= s2.length(); j++) {

                if (i == 0) {
                    mem[i][j] = j;
                }

                else if (j == 0) {
                    mem[i][j] = i;
                }

                else {

                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                        mem[i][j] = mem[i - 1][j - 1];
                    } else {

                        mem[i][j] = 1 + Math.min(mem[i][j - 1], Math.min(mem[i - 1][j - 1], mem[i - 1][j]));
                    }

                }
            }
        }
        return mem[s1.length()][s2.length()];
    }
}
