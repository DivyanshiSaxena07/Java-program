
//digonal of a matrix

import java.util.Scanner;
class Awork
{
    public static void main(String... args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Application to print digonal of matrix");
        System.out.println("Enter the rows of matrix");
        int m=sc.nextInt();
        System.out.println("Enter the column of matrix");
        int n=sc.nextInt();
        if(m==n)
        {
        int [][]a=new int[m][n]; 
        System.out.println("Enter the matrix of "+m+" x "+n);
        for(int r=0;r<m;r++)
        {
            System.out.println("Enetr "+n+" element of"+m+" row");
            for(int c=0;c<n;c++)
                a[r][c]=sc.nextInt();
        }
        System.out.println("Given array is");
        for(int r=0;r<m;r++)
        {
            for(int c=0;c<n;c++)
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("Digonal of the matrix is");
        for(int r=0;r<m;r++)
            for(int c=0;c<n;c++)
            {
                if(r==c)
                System.out.print(a[r][c]+" ");
            }
        }
        else
        System.out.println("invalid matrix to print digonal");
    }
}


//right digonal of matrix

// import java.util.Scanner;
// class Awork
// {
//     public static void main(String... args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Application to print left digonal of matrix");
//         System.out.println("Enter the rows of matrix");
//         int m=sc.nextInt();
//         System.out.println("Enter the column of matrix");
//         int n=sc.nextInt();
//         if(m==n)
//         {
//         int [][]a=new int[m][n]; 
//         System.out.println("Enter the matrix of "+m+" x "+n);
//         for(int r=0;r<m;r++)
//         {
//             System.out.println("Enetr "+n+" element of "+m+" row");
//             for(int c=0;c<n;c++)
//                 a[r][c]=sc.nextInt();
//         }
//         System.out.println("Given array is");
//         for(int r=0;r<m;r++)
//         {
//             for(int c=0;c<n;c++)
//             {
//                 System.out.print(a[r][c]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println("Left Digonal of the matrix is");
//         for(int r=0;r<m;r++)
//             for(int c=0;c<n;c++)
//             {
//                 if(r+c==m-1)
//                 System.out.print(a[r][c]+" ");
//             }
//         }
//         else
//         System.out.println("invalid matrix to print digonal");
//     }
// }



// //lower triangle


// import java.util.Scanner;
// class Awork
// {
//     public static void main(String... args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Application to print lower triangle of matrix");
//         System.out.println("Enter the rows of matrix");
//         int m=sc.nextInt();
//         System.out.println("Enter the column of matrix");
//         int n=sc.nextInt();
//         if(m==n)
//         {
//         int [][]a=new int[m][n]; 
//         System.out.println("Enter the matrix of "+m+" x "+n);
//         for(int r=0;r<m;r++)
//         {
//             System.out.println("Enetr "+n+" element of "+m+" row");
//             for(int c=0;c<n;c++)
//                 a[r][c]=sc.nextInt();
//         }
//         System.out.println("Given array is");
//         for(int r=0;r<m;r++)
//         {
//             for(int c=0;c<n;c++)
//             {
//                 System.out.print(a[r][c]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println("lower triangle of the matrix is");
//         for(int r=0;r<m;r++)
//             for(int c=0;c<n;c++)
//             {
//                 if(r==c||r<c)
//                     a[r][c]=0;
//             }
//         for(int r=0;r<m;r++)
//         {
//             for(int c=0;c<n;c++)
//             {
//                 System.out.print(a[r][c]+" ");
//             }
//             System.out.println();
//         }
//         }
//         else
//         System.out.println("invalid matrix to print digonal");
//     }
// }



//Upper triangle


// import java.util.Scanner;
// class Awork
// {
//     public static void main(String... args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Application to print Upper triangle of matrix");
//         System.out.println("Enter the rows of matrix");
//         int m=sc.nextInt();
//         System.out.println("Enter the column of matrix");
//         int n=sc.nextInt();
//         if(m==n)
//         {
//         int [][]a=new int[m][n]; 
//         System.out.println("Enter the matrix of "+m+" x "+n);
//         for(int r=0;r<m;r++)
//         {
//             System.out.println("Enetr "+n+" element of "+m+" row");
//             for(int c=0;c<n;c++)
//                 a[r][c]=sc.nextInt();
//         }
//         System.out.println("Given array is");
//         for(int r=0;r<m;r++)
//         {
//             for(int c=0;c<n;c++)
//             {
//                 System.out.print(a[r][c]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println("Upper triangle of the matrix is");
//         for(int r=0;r<m;r++)
//             for(int c=0;c<n;c++)
//             {
//                 if(r==c||r>c)
//                     a[r][c]=0;
//             }
//         for(int r=0;r<m;r++)
//         {
//             for(int c=0;c<n;c++)
//             {
//                 System.out.print(a[r][c]+" ");
//             }
//             System.out.println();
//         }
//         }
//         else
//         System.out.println("invalid matrix to print digonal");
//     }
// }




// //Sum of row


// import java.util.Scanner;
// class Awork
// {
//     public static void main(String... args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Application to print sum of row of matrix");
//         System.out.println("Enter the rows of matrix");
//         int m=sc.nextInt();
//         System.out.println("Enter the column of matrix");
//         int n=sc.nextInt();
//         int [][]a=new int[m][n]; 
//         System.out.println("Enter the matrix of "+m+" x "+n);
//         for(int r=0;r<m;r++)
//         {
//             System.out.println("Enter "+n+" element of "+m+" row");
//             for(int c=0;c<n;c++)
//                 a[r][c]=sc.nextInt();
//         }
//         System.out.println("Given array is");
//         for(int r=0;r<m;r++)
//         {
//             for(int c=0;c<n;c++)
//             {
//                 System.out.print(a[r][c]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println("sum of row of the matrix is");
//         for(int r=0;r<m;r++)
//         {
//             int sum=0;
//             for(int c=0;c<n;c++)
//                 sum=sum+a[r][c];
//             System.out.print(sum+" ");
//         }
//     }
// }



//print the row of maximum sum


// import java.util.Scanner;
// class Awork
// {
//     public static void main(String... args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         int max=0,row=0;
//         System.out.println("Application to print the row of maximum sum of matrix");
//         System.out.println("Enter the rows of matrix");
//         int m=sc.nextInt();
//         System.out.println("Enter the column of matrix");
//         int n=sc.nextInt();
//         int [][]a=new int[m][n]; 
//         System.out.println("Enter the matrix of "+m+" x "+n);
//         for(int r=0;r<m;r++)
//         {
//             System.out.println("Enter "+n+" element of "+m+" row");
//             for(int c=0;c<n;c++)
//                 a[r][c]=sc.nextInt();
//         }
//         System.out.println("Given array is");
//         for(int r=0;r<m;r++)
//         {
//             for(int c=0;c<n;c++)
//             {
//                 System.out.print(a[r][c]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println("sum of row of the matrix is");
//         for(int r=0;r<m;r++)
//         {
//             int sum=0;
//             for(int c=0;c<n;c++)
//                 sum=sum+a[r][c];
//             System.out.print(sum+" ");

//             if(sum>max)
//             {
//                 max=sum;
//                 row=r;
//             }
//         }

//         System.out.println("row which have maximum sum is");
//         for(int c=0;c<n;c++)
//             System.out.print(a[row][c]+" ");
//     }
// }


//transpose

// import java.util.Scanner;
// class Awork
// {
//     public static void main(String... args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         int max=0,row=0;
//         System.out.println("Application to print traspose of matrix");
//         System.out.println("Enter the rows of matrix");
//         int m=sc.nextInt();
//         System.out.println("Enter the column of matrix");
//         int n=sc.nextInt();
//         int [][]a=new int[m][n]; 
//         System.out.println("Enter the matrix of "+m+" x "+n);
//         for(int r=0;r<m;r++)
//         {
//             System.out.println("Enter "+n+" element of "+m+" row");
//             for(int c=0;c<n;c++)
//                 a[r][c]=sc.nextInt();
//         }
//         System.out.println("Given array is");
//         for(int r=0;r<m;r++)
//         {
//             for(int c=0;c<n;c++)
//             {
//                 System.out.print(a[r][c]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println("transpose the matrix is");
//         for(int r=0;r<m;r++)
//         {
//             for(int c=n-1;c>=0;c--)
//             System.out.print(a[r][c]+" ");
//             System.out.println();
//         }
//     }
// }



//maximum even no and minimum odd number

// import java.util.Scanner;
// class Awork
// {
//     public static void main(String... args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Application to print maximum even no and minimum odd number of matrix");
//         System.out.println("Enter the rows of matrix");
//         int m=sc.nextInt();
//         System.out.println("Enter the column of matrix");
//         int n=sc.nextInt();
//         int [][]a=new int[m][n]; 
//         System.out.println("Enter the matrix of "+m+" x "+n);
//         for(int r=0;r<m;r++)
//         {
//             System.out.println("Enter "+n+" element of "+m+" row");
//             for(int c=0;c<n;c++)
//                 a[r][c]=sc.nextInt();
//         }
//         System.out.println("Given array is");
//         for(int r=0;r<m;r++)
//         {
//             for(int c=0;c<n;c++)
//             {
//                 System.out.print(a[r][c]+" ");
//             }
//             System.out.println();
//         }
//         int max=a[0][0],min=a[0][0];
//         System.out.println("maximum even no and minimum odd number the matrix is");
//         for(int r=0;r<m;r++)
//         {
//             for(int c=0;c<n;c++)
//             {
//                 if(max<a[r][c] && a[r][c]%2 ==0)
//                     max=a[r][c];
//                 if(min>a[r][c] && a[r][c]%2 !=0)
//                     min=a[r][c];
//             }
//         }
//         System.out.println("maximum even no"+max);
//         System.out.println("minimum odd number"+min);
//     }
// }


//swapping of rows 

// import java.util.Scanner;
// class Awork
// {
//     public static void main(String... args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         int max=0,min=0,maxr=0,minr=0;
//         System.out.println("Application to swap the rows of matrix");
//         System.out.println("Enter the rows of matrix");
//         int m=sc.nextInt();
//         System.out.println("Enter the column of matrix");
//         int n=sc.nextInt();
//         int [][]a=new int[m][n]; 
//         System.out.println("Enter the matrix of "+m+" x "+n);
//         for(int r=0;r<m;r++)
//         {
//             int sum=0;
//             System.out.println("Enter "+n+" element of "+m+" row");
//             for(int c=0;c<n;c++)
//             {
//                 a[r][c]=sc.nextInt();
//                 sum=sum+a[r][c];
//             }
//             if(sum>max)
//             {
//                 max=sum;
//                 maxr=r;
//             }
//             if(sum<min)
//             {
//                 min=sum;
//                 minr=r;
//             }
//         }
//         System.out.println("Given array is");
//         for(int r=0;r<m;r++)
//         {
//             for(int c=0;c<n;c++)
//             {
//                 System.out.print(a[r][c]+" ");
//             }
//             System.out.println();
//         }
//         for(int c=0;c<n;c++)
//         {
//             int temp=a[maxr][c];
//             a[maxr][c]=a[minr][c];
//             a[minr][c]=temp;
//         }
//         System.out.println("After swapping of row array is");
//         for(int r=0;r<m;r++)
//         {
//             for(int c=0;c<n;c++)
//             {
//                 System.out.print(a[r][c]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
