package ForPracticing;

import java.util.Scanner;

public class CPU
{   
    int AT, CT, TAT, BT, WT;
    public void ArrivalTime()
    {
    	System.out.println("Enter the value....");
        Scanner sc = new Scanner(System.in);
        //System.out.println("Arrival Time:" );
        int AT = sc.nextInt();
        System.out.println("Arrival Time:"+AT);
    }

    public void BurstTime()
    {
    	
        Scanner sc = new Scanner(System.in);
        //System.out.println("Burst Time:");
        System.out.println("Enter the value....");
        int BT = sc.nextInt();
        System.out.println("Burst Time:"+BT);
    }

    public void CompleteTime()
    {   
        //System.out.println("Complete Time: ");
        Scanner sc =  new Scanner(System.in);
        int CT = sc.nextInt();
        System.out.println("Complete Time: "+CT);
    }
    public void TotalArrivalTime()
    {
        //int TAT;
        
        TAT = CT - AT;
        System.out.println("TAT: "+TAT);
    }
    public void WaitingTime()
    {
        WT = TAT - BT;
        System.out.println("Waiting Time: "+WT);
    }
 
    public static void main(String args[])
    {
        CPU c = new CPU();
        c.ArrivalTime();
        c.BurstTime();
        c.CompleteTime();
        c.TotalArrivalTime();
        c.WaitingTime();

    }
}
 