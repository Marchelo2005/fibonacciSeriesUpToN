package com.example.fibonacciseriesupton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class HelloApplication {


    public static void main(String[] args) {
        int iteration=0,dataA=1,dataB=0,sumSeries=0;

     Scanner seriesLimit=new Scanner(System.in);
     System.out.println("Fibonacci series up to n numbers \n Enter the value of n");
     int integerRangeN= seriesLimit.nextInt();
     System.out.println("Fibonacci series");
     for (iteration=1; iteration<=integerRangeN;iteration++){
     System.out.println(dataB);
     sumSeries=dataA+dataB;
     dataB=dataA;
     dataA=sumSeries;
     }
    }
}