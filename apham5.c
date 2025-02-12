//Alex Pham
//Lab 5
//CSC 321

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	//4 different types of variables
	int i, a = 21;
	float b = 31.41;
	char c = 'L';
	double d = 40.22;

	//Print statements for each variable
	printf("Int variable a is %d and it's address is %p \n",a,&a);
	printf("Float variable b is %.2f and it's address is %p \n",b,&b);
	printf("Char variable c is %c and it's address is %p \n",c,&c);
	printf("Double variable d is %.4f and it's address is %p\n\n",d,&d);

	//If statement block
	if (1)
	{
		int y = 5;
	}
	//Error
	//printf("The value of y is %d \n",y);

	//Creates an array of size 10 
	int arr[10];
	for(i = 0; i < 10; i++)
	{
		arr[i] = i;
		printf("address of arr[%d] = %p \n",arr[i],&arr[i]);
	}	


	return EXIT_SUCCESS;
}
