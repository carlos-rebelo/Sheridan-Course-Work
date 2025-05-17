#include <stdio.h>
#include <stdlib.h>

int main() {
    int userInt;

	printf("Please enter a number: ");
	scanf("%d", &userInt);

	if (userInt % 2 == 0) {
		printf("That number is even!");
	}

	else {
		printf("That number is odd");
	}

	return 0;
}
