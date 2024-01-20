/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.kseniaandpanscales;

import java.util.*;

/**
 *
 * @author Islam Mohamed
 */
public class KseniaAndPanScales {

    public static void main(String[] args) {
        String str1, str2, str3 = "", str4 = "";

        int leftCounter = 0, rightCounter = 0, mx, mn;
        Scanner scan = new Scanner(System.in);
        str1 = scan.nextLine();
        str2 = scan.nextLine();
        for (int i = 0; i < str1.indexOf("|"); i++) {
            leftCounter++;
            str3 += str1.toCharArray()[i];

        }
        for (int j = str1.indexOf("|") + 1; j < str1.length(); j++) {
            rightCounter++;
            str4 += str1.toCharArray()[j];

        }
        mx = Math.max(leftCounter, rightCounter);
        mn = Math.min(leftCounter, rightCounter);

        if (mx == mn) {
            if (str2.length() % 2 == 0) {
                for (int i = 0; i < str2.length(); i++) {
                    if (i % 2 == 0) {
                        str4 += str2.toCharArray()[i];
                    } else {
                        str3 += str2.toCharArray()[i];
                    }
                }
                System.out.println(str3 + "|" + str4);
            } else {
                System.out.println("Impossible");
            }

        } else {
            if (mx == mn + str2.length()) {
                if (str3.length() == mn) {
                    str3 = str3.concat(str2);
                } else {
                    str4 = str4.concat(str2);
                }
                System.out.println(str3 + "|" + str4);
            } else {

                if ((mn + str2.length() - mx) % 2 == 0 && (mn + str2.length() - mx) > 0) {

                    for (int i = 0; i < str2.length(); i++) {

                        if (str3.length() == str4.length()) {
                            str4 += str2.toCharArray()[i];
                        } else {
                            int mn2 = Math.min(str3.length(), str4.length());
                            if (str3.length() == mn2) {
                                str3 += str2.toCharArray()[i];
                            } else {
                                str4 += str2.toCharArray()[i];
                            }
                        }
                    }
                    System.out.println(str3 + "|" + str4);
                } else {
                    System.out.println("Impossible");
                }

            }
        }

    }
}
