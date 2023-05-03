package edu.javaCourse.lesson_2.homework;

public class First {
    public static void main(String[] args) {

        byte bdec = 12;
        byte bbin = 0b1100;
        byte boct = 014;
        byte bhex = 0xC;
        System.out.print(bdec + " " + bbin + " " + boct + " " + bhex + "\n");

        short sdec = 1300;
        short sbin = 0B0101_0001_0100;
        short soct = 02424;
        short shex = 0x514;
        System.out.print(sdec + " " + sbin + " " + soct + " " + shex + " \n");

        int idec = 0;
        int ibin = 0b0;
        int ioct = 00;
        int inex = 0x0;
        System.out.print(idec + " " + ibin + " " + ioct + " " + inex + "\n");

        long ldec = 123456789L;
        long lbin = 0b0111010110111100110100010101L;
        long loct = 0726746425L;
        long lnex = 0x75BCD15L;
        System.out.print(ldec + " " + lbin + " " + loct + " " + lnex);


    }
}
