#include<stdio.h>
void main(){
 
 int n,ch;
 printf("Enter the limit of array : ");
 scanf("%d",&n);
 
 int a[100],i,ele,temp,pos,j,b[n],c[100],m;
 printf("Enter %d elements : ",n);
 
 for(i=0;i<n;i++){
  scanf("%d",&a[i]);
 }
 
 
 
 do{
	 printf("\n------------------\n");
	 printf("1 Inserting\n");
	 printf("2 Deleting\n");
	 printf("3 Traversing\n");
	 printf("4 Searching\n");
	 printf("5 Sorting\n");
	 printf("6 Merging\n");
	 printf("7 Exit\n");
	 printf("Enter your choice : ");
	 scanf("%d",&ch);
 	switch(ch)
 	{
 	  case 1 : 
 	  	printf("Enter the element to be inserted : ");
 	  	scanf("%d",&ele);
 	  	printf("Enter the position : ");
 	  	scanf("%d",&pos);
 	  	if(pos<=n)
 	  	{
 	  	  for(i=n-1;i>=pos-1;i--)
 	  	  {
 	  	    a[i+1] = a[i];
 	  	  }
 	  	  a[pos-1]=ele;
 	  	  n=n+1;
 	  	  printf("Element inserted successfully...\n");
 	  	}
 	  	else
 	  	  printf("Position is invalid");
 	  	break;
 	  
  	}
 }while(1);
  
}
