package com.bl.stock_account.mngmt;
import java.util.Scanner;
public class StockReport
{
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter how many stocks you want to buy :");
        int stocknum = sc.nextInt();

        String [] stockname = new String[stocknum];
        int [] numofshares = new int[stocknum];
        double [] shareprice = new double[stocknum];

        for (int i = 0; i < stocknum; i++){
            System.out.println("enter details about stock "+(i+1) + ":");
            System.out.print("stock Name : ");
            stockname[i] = sc.next();
            System.out.println("num of shares : ");
            numofshares[i] = sc.nextInt();
            System.out.println("share price : ");
            shareprice[i] = sc.nextDouble();

        }

        System.out.println("Stock Report");
        double total_value = 0.0;
        for (int i = 0; i < stocknum; i++){
            double stock_value = numofshares[i] * shareprice[i];
            System.out.printf("%-10s %10d %10.2f $%10.2f\n", stockname[i] ,numofshares[i] , shareprice[i],stock_value);
            total_value += stock_value;
            System.out.println("stockName : "+stockname);
        }

        System.out.println("----------------------");
        System.out.println("totall stock value :"+total_value);
    }
}
