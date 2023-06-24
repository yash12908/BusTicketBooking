import java.util.Scanner;
public class busTicket_drive
{
    Account A;
    busTicket B;
     public void AddAccount()
     {
         if(A==null)
         {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter Your Name");
             String name=sc.next();
             System.out.println("Enter Your Address");
             String Address=sc.next();
             System.out.println("Enter Your Phone Number");
             double PhoneNo=sc.nextDouble();
             A=new Account(name,Address,PhoneNo);//account object is created
             System.out.println("Account is created Successfully");
         }
         else
         {
             System.out.println("Account Exit Already");
         }
     }
     public void bookTicket()
     {
         if(A==null)
         {
             System.out.println("First Make Account");
         }
         else
         {
             System.out.println("Which Bus Servies You Want");
             System.out.println("1:- vidharbh 2:- purpal 3:- royal");
             System.out.println("Enter the Number");
             Scanner sc=new Scanner(System.in);
             int a=sc.nextInt();
             if(a==1)
             {
                 System.out.println(" From ");
                 String from=sc.next();
                 System.out.println(" To ");
                 String to=sc.next();
                 System.out.println(" KM ");
                 int KM=sc.nextInt();
                 B=new vidharbh(from,to,KM);
                 System.out.println("Go to the Payment Section");
             }
             if(a==2)
             {
                 System.out.println(" From ");
                 String from=sc.next();
                 System.out.println(" To ");
                 String to=sc.next();
                 System.out.println(" KM ");
                 int KM=sc.nextInt();
                 B=new purpal(from,to,KM);//upcasting
                 System.out.println("Go to the Payment Section");
             }
             if(a==3)
             {
                 System.out.println(" From ");
                 String from=sc.next();
                 System.out.println(" To ");
                 String to=sc.next();
                 System.out.println(" KM ");
                 int KM=sc.nextInt();
                 B=new royal(from,to,KM);
                 System.out.println("Go to the Payment Section");
             }
             else
             {
                 System.out.println("Enter From Option");
             }
         }
     }
     public void Payment()
     {
         if(A==null)
         {
             if(B==null)
             {
                 System.out.println("First Book Ticket");
             }
             else
             {
                 System.out.println("First Make Account And Then Book Ticket");
             }
         }
         else
         {
             if(B instanceof vidharbh)
             {
                 Scanner sc=new Scanner(System.in);
                 vidharbh V=(vidharbh)B;//DownCasting
                 int total =V.price*V.km;
                 System.out.println(V.from);
                 System.out.println(V.to);
                 System.out.println(V.km);
                 System.out.println("----------------------------");
                 System.out.println("-------------Total----------");
                 System.out.println("-----------"+total+"--------");
                 System.out.println("----------------------------");
                 System.out.println("1 :- conformation 2 :- cancel");
                 if(sc.nextInt()==1)
                 {
                     System.out.println("Ticket Book Successfully");
                 }
                 else
                 {
                     B=null;
                     System.out.println("Ticket Cancle Successfully");
                 }
             }
             if(B instanceof purpal)
             {
                 Scanner sc=new Scanner(System.in);
                 purpal P=(purpal)B;//DownCasting
                 int total =P.price*P.km;
                 System.out.println(P.from);
                 System.out.println(P.to);
                 System.out.println(P.km);
                 System.out.println("----------------------------");
                 System.out.println("-------------Total----------");
                 System.out.println("-----------"+total+"--------");
                 System.out.println("----------------------------");
                 System.out.println("1 :- conformation 2 :- cancel");
                 if(sc.nextInt()==1)
                 {
                     System.out.println("Ticket Book Successfully");
                 }
                 else
                 {
                     B=null;
                     System.out.println("Ticket Cancel Successfully");
                 }
             }
             if(B instanceof royal)
             {
                 Scanner sc=new Scanner(System.in);
                 royal R=(royal)B;//DownCasting
                 int total =R.price*R.km;
                 System.out.println(R.from);
                 System.out.println(R.to);
                 System.out.println(R.km);
                 System.out.println("----------------------------");
                 System.out.println("----------Total----------");
                 System.out.println("-----------"+total+"--------");
                 System.out.println("----------------------------");
                 System.out.println("1 :- conformation 2 :- cancel");
                 if(sc.nextInt()==1)
                 {
                     System.out.println("Ticket Book Successfully");
                 }
                 else
                 {
                     B=null;
                     System.out.println("Ticket Cancel Successfully");
                 }
             }
         }
     }
     public void cancleTicket()
     {
         if(A==null)
         {
             if(B==null)
             {
                 System.out.println("First Book Ticket");
             }
             else System.out.println("first Make Account ");
         }
         else
         {
             if(B instanceof vidharbh )
             {
                 B=null;
                 System.out.println("Ticket Cancel Successfully");
             }
             if(B instanceof purpal )
             {
                 B=null;
                 System.out.println("Ticket Cancel Successfully");
             }
             if(B instanceof royal )
             {
                 B=null;
                 System.out.println("Ticket Cancel Successfully");
             }
         }
     }
     public void detailsTicket()
     {
         if(A==null)
         {
             if(B==null)
             {
                 System.out.println("First Book Ticket");
             }
            else System.out.println("First Make Account");
         }
         else
         {
             if(B instanceof vidharbh)
             {
                 System.out.println(B.from);
                 System.out.println(B.to);
                 System.out.println(B.km);

             }
             if(B instanceof purpal)
             {
                 System.out.println(B.from);
                 System.out.println(B.to);
                 System.out.println(B.km);

             }
             if(B instanceof royal)
             {
                 System.out.println(B.from);
                 System.out.println(B.to);
                 System.out.println(B.km);

             }
         }
     }
}
