
package com.example;
import com.example.common.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    List<String> chooseAMonth = new ArrayList<>();

    for (Month aMonth : Month.values()){
      chooseAMonth.add(aMonth.getEnglishName());
    }
    System.out.println(chooseAMonth);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose a month from above: ");


    List<String> monthsRemaining = new ArrayList<>();
    String userMonth = scanner.nextLine();

    int monthIndex = Month.valueOf(userMonth.toUpperCase()).ordinal();

    for (int i = monthIndex + 1; i < chooseAMonth.size(); i++){
      monthsRemaining.add(chooseAMonth.get(i));
    }

    System.out.println("Months remaining in the year: ");
    System.out.println(monthsRemaining);
  }
}