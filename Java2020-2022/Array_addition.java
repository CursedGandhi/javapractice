import java.util.Scanner;

public class Array_addition{
    static int Maxfunc(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int m,n,p,q ;
        System.out.println("Enter number of rows for matrix A : ");
        m=in.nextInt();
        int [][]arr1 = new int[m][];
        for (int i=0;i<m;i++){
            System.out.println("Enter number of elements in row "+i+":");
            n=in.nextInt();
            //Creating space for elements to enter.
            arr1[i]=new int [n];
            System.out.println("Enter "+n+" elements: ");
            for(int j=0;j<n;j++){
                arr1[i][j] = in.nextInt(); 
            }
        }
        System.out.println("Enter number of rows for matrix B : ");
        p=in.nextInt();
        int [][]arr2 = new int[p][];
        for (int i=0;i<p;i++){
            System.out.println("Enter number of elements in row "+i+":");
            q=in.nextInt();
            //Creating space for elements to enter.
            arr2[i]=new int [q];
            System.out.println("Enter "+q+" elements: ");
            for(int j=0;j<q;j++){
                arr2[i][j] = in.nextInt(); 
            }
        }
        int x,y;
        x= Maxfunc(m, p);
        int [] [] arr3 = new int[x][];
        for(int i=0;i<x;i++){
            if(i<m && i<p){
                y= Maxfunc(arr1[i].length,arr2.length);
                arr3[i]=new int[y];

                
            }
            else if(i<m){
                y=arr1.length;
                arr3[i]=new int[y];
            }
            else if(i<p){
                y=arr2.length;
                arr3[i]= new int[y];
            }
        }
        for(int i = 0; i < arr3.length; i++)
        {
            for(int j = 0; j < arr3[i].length; j++)
            {
                if(arr1.length<arr3.length)
                {
                    if(arr2[i].length>arr3[i].length);
                    {
                        arr3[i][j] = arr2[i][j];
                    }
                }
                else if(arr2.length<arr3.length)
                {
                    if(arr1[i].length<arr3[i].length)
                    {
                        arr3[i][j] = arr2[i][j];
                    }
                }
                else
                {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        }
        System.out.println("\n\n");
        for(int i = 0; i < arr3.length; i++)
        {
            for(int j = 0; j < arr3[i].length; j++)
            {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }     
}