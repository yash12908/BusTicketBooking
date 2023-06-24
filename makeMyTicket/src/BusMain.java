import java.util.Scanner;
public class BusMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        busTicket_drive Bs=new busTicket_drive();
        System.out.println("---Welcome To Bus Ticket Service---");
        for(;;)
        {
            System.out.println(" 1:- Make Account 2:- BookTicket 3:-Payment 4:-Cancel Ticket 5:-Details Of Ticket 6:- Exit Application");
            switch(sc.nextInt())
            {
                case 1:
                    Bs.AddAccount();
                    break;
                case 2:
                    Bs.bookTicket();
                    break;
                case 3:
                   Bs.Payment();
                    break;
                case 4:
                    Bs.cancleTicket();
                    break;
                case 5:
                    Bs.detailsTicket();
                    break;
                case 6:
                    System.out.println("Application Exit Successfully");
                   return;

            }
        }
    }
}