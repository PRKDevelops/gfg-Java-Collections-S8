//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            TreeSet<String>ts=new TreeSet<>();
            int n=sc.nextInt();;
            for(int i=0;i<n;i++)
            {
                String s=sc.next();
                ts.add(s);
            }
            char a=sc.next().charAt(0);
            char b=sc.next().charAt(0);
            char c=sc.next().charAt(0);
            char d=sc.next().charAt(0);
            gfg1 obj=new gfg1();
            obj.task(ts,a,b,c,d);
        }
    }
}


// } Driver Code Ends
//User function Template for Java

class gfg1
{
    void task(TreeSet<String> ts,char a,char b,char c,char d)
    {
        // Add your code here. Print the output here itself.
         System.out.println(ts.headSet(Character.toString(a)));
       System.out.println(ts.tailSet(Character.toString(b)));
       System.out.println(ts.subSet(Character.toString(c), Character.toString(d)));
    }
}

//{ Driver Code Starts.

// } Driver Code Ends