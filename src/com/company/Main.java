package com.company;

public class Main {

    public static void main(String[] args) {
	// tabel
        int suurus = 3;
        //read
        for (int r = 0; r < suurus; r++){
            //veerud
            for (int v = (suurus); v >= 0; v--){
                //veeru nr väljastamine
                System.out.print(v + " ");
            }
            //reavahetus
            System.out.println();
        }
    }
}
