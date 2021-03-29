package com.shsxt.house.config;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class hello {
    public static void main(String[] args){
        String a="hello world";
        boolean s=Pattern.matches(a,"^^[a-z]+$");
        if (s==false) {
            a = a.toUpperCase();
        }
        System.out.println(a);

        String b="Hello World";
        char[] c=b.toCharArray();
        for (int q=0;q<c.length;q++){
            if (c[q]=='o'){
                c[q]='*';
            }
        }
        System.out.println(c);

        String d="2020-6-1";
        int two;
        String[] e=d.split("-");
        if (Integer.parseInt(e[0])%4==0&&Integer.parseInt(e[0])%100!=0||Integer.parseInt(e[0])%400==0){
            two=29;
        }else {
            two=28;
        }
        int numday=0;
        int num=Integer.parseInt(e[1]);
        num=num-1;
        int day=Integer.parseInt(e[2]);
        numday=numday+day;
        while (num>0){
            if(num==1||num==3||num==5||num==7||num==8||num==10||num==12){
                numday=numday+31;
            }
            if (num==2){
                numday=numday+two;
            }
            if (num==4||num==6||num==9||num==11){
                numday=numday+30;
            }
            num--;
        }
        System.out.println(numday);

        int n=4;
        for(int i=1;i<=n-1;i++)
        {
            for(int k=n-1;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("++++++++");
        for(int i=n-1;i>=1;i--)
        {
            for(int k=i;k<=n-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}