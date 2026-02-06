/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.home.isnumbereven;
import java.io.*;
/**
 *
 * @author PC
 */
public class IsNumberEven 
{

    public static void main(String[] args) throws Exception
    {
        System.out.println("Input an integer positive number");
        var bufStdIn = new BufferedReader(new InputStreamReader(System.in));
        var ulNumber = Long.parseUnsignedLong(bufStdIn.readLine());
        if(ulNumber % 2 == 0)
            System.out.print("The number is even");
        else
            System.out.println("The number is odd");
    }
}
