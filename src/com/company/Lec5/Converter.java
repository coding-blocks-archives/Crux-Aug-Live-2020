package com.company.Lec5;

public class Converter {

    public static void main(String[] args) {

        System.out.println(bintodeci(1011));

        System.out.println(any2deci(1011,2));

        System.out.println(deci2bin(11));

        System.out.println(deci2any(11,2));

        System.out.println(any2any(1011,2,2));
    }

    public static int bintodeci(int bin){

        int place=1;
        int deci =0;

        while(bin>0){

            int r = bin%10;
            bin=bin/10;

            deci= deci+r*place;
            place=place*2;
        }
        return deci;
    }

    public static int any2deci(int any, int base){

        int place=1;
        int deci=0;

        while(any>0){

            int r =any%10;
            any=any/10;

            deci =deci + r*place;
            place =place*base;
        }

        return deci;
    }

    public static int deci2bin(int deci){

        int place=1;
        int bin =0;

        while(deci>0){

            int r = deci%2;
            deci=deci/2;

            bin= bin+r*place;
            place=place*10;
        }
        return bin;
    }

    public static int deci2any(int deci, int base){

        int place=1;
        int any =0;

        while(deci>0){

            int r = deci%base;
            deci=deci/base;

            any= any+r*place;
            place=place*10;
        }
        return any;
    }

    public static int any2any(int any , int fbase, int sbase){

       int deci = any2deci(any,fbase);

       return deci2any(deci,sbase);
    }
}
