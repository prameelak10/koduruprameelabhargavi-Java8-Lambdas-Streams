import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Average of list\n2. Get string start with 'a' and length 3\n3. Get all palindrome strings.\nEnter your choice");
        int n=sc.nextInt();

        System.out.println("Enter length of list");
        int m=sc.nextInt();
        if(n==1)
        {
            System.out.println("Enter list of integers:");
            List<Integer> b = new ArrayList<>();
            for(int i=0;i<m;++i)
            {
                b.add(sc.nextInt());
            }
                AverageOfList a=new AverageOfList();
                System.out.println("Average: "+a.calculate(b));
        }
        else if(n==2)
        {
            System.out.println("Enter strings line by line:");
            List<String> b=new ArrayList<>();
            for(int i=0;i<m;++i)
            {
                b.add(sc.nextLine());
            }
            TypeofString a=new TypeofString();
            b=a.startsWithA(b);
            System.out.println("List that matches");
            for(String i: b)
            {
                System.out.println(i);
            }
        }
        else if(n==3)
        {
            System.out.println("Enter strings line by line:");
            List<String> b=new ArrayList<>();
            for(int i=0;i<=m;++i)
            {
                b.add(sc.nextLine());
            }
            ListStrings a=new ListStrings();
            b=a.calculate(b);
            System.out.println("List of Palindrome strings");
            for(String i: b)
            {
                System.out.println(i);
            }
        }
    }
}
