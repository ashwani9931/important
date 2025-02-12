Longest Substring Without Repeating Characters

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the character: ");
        String str=sc.nextLine();
        int f=0;
        for(int i=1;i<=str.length()-1;i++)
        {
            char ch =str.charAt(i);
            for(int j=0 ;j<i;j++)
            {
                char ch1=str.charAt(j);
                if(ch1==ch)
                {
                    f=1;
                    System.out.println("repeated characters '"+ch+"' found after:"+(i-j)+" characters:");
                    return;
                }

            }
        }
        if(f==0)
        {
            System.out.println("no repeated of the characters found");
        }


    }
}
