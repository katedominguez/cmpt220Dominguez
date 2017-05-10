/**
file: Lab7Problem3.java;
Kaitlyn Dominguez
CMPT 220
Lab 7 Problem 10.17
April 20, 2017
*/

import java.math.BigDecimal;
public class Lab7Problem3{
  public static void main(String[] args) {
    BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
    long x = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal n = new BigDecimal(x);
    int a= 0;
    while (a< 10) {
      BigDecimal squared = n.multiply(n);
      if(squared.compareTo(longMaxValue) > 0) {
        a++;
        System.out.println(a+": " + n + " squared = " + squared);
      }
      n = n.add(BigDecimal.ONE);
    }
  }
}