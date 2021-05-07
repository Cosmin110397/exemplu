package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cuvantAles = new Scanner(System.in);
        System.out.println("Enter you word: ");
        String cuvant = cuvantAles.nextLine();
        char z;
        int y=0;
        z= cuvant.charAt(y);
        if (z=='a' || z=='e' || z=='i' || z=='o' || z=='u' || z=='ă' || z=='î' || z=='â'
                || z=='A' || z=='E' || z=='I' || z=='O' || z=='U' || z=='Ă' || z=='Î' || z=='Â')

            System.out.println("Cuvantul incepe cu o vocala! ");
        else
            System.out.println("Cuvantul NU incepe cu o vocala!");


    }
}
