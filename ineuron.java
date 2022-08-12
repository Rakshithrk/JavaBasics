package patterns;

public class ineuron {
	public static void main(String[] args) {
		int i,j,n=10;
		// A 
				for ( i = 0; i < n; i++) {
					for ( j = 0; j < n; j++) {

						if (i == 0 || j == 0 || i == (n - 1) / 2 || j == (n - 1))
							System.out.print("* ");
						else
							System.out.print("  ");
					}
					System.out.println("  ");
				}
System.out.println("  ");
				// B 
				for ( i = 0; i < n; i++) {
					for ( j = 0; j < n; j++) {

						if (i == 0 || j == 0 || i == (n - 1) / 2 || j == (n - 1) || i==(n-1))
							System.out.print("* ");
						else
							System.out.print("  ");
					}
					System.out.println("  ");
				}
System.out.println("  ");

//C
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (i == 0 || j == 0 || i==(n-1))
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");
		
		
//D
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (i == 0 && j < (n - (n - 1) / 4) || j == 0 || i == (n - 1) && j < (n - (n - 1) / 4)
				|| j == n - 1 && i != 0 && i != n - 1)
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//E
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (i == 0 || j == 0 || i==(n-1)  || i==(n-1)/2 && j<n-(n/2))
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");
	
//F
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (i == 0 && j<n-(n/4) || j == 0 || i==(n-1)/2 && j<n-(n/2))
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//G
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (i == 0 && j<n-2 || i==n-1||  (j==(n-1) && i>(n-1)/2) || j == 0 || i==(n-1)/2 && j>n-(n/2))
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//H
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (j == 0   || j==(n-1)|| i==(n-1)/2 )
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//I
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (i==0||i==n-1||j==(n-1)/2)
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//J
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (i == 0 || (i==n-1 && j<=(n-1)/2) ||  (j==(n-1)/2) )
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//k
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if ( i >= 0 && j == (n - 1) / 2 || i == j && j > n / 2 || i + j == n - 1 && i < 3 * (n / 4) )
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//EI
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (i == n-1 && j<n-2 || j==0 )
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//M
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (j==0|| j==n-1||(i==j&& i<n/2)||(i+j==n-1 && i<n/2))
			System.out.print( "* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//N
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (j==0|| j==n-1||(i==j))
			System.out.print( "* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

// O
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if ((i == n-1 && j!=n-1) || i==0 && j!=0 || (j==n-1 && i!=n-1) || (j==0 && i!=0) )
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

// P
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if ((i == 0 && j<n/2) || j==0 || (i == (n-1)/2 && j<n/2) || (j == n/2&& i<n/2))
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//Q
for ( i = 0; i < n+1; i++) {
	for ( j = 0; j < n+1; j++) {

		if ((i == n-1 && j<n) || (i==0 && j<n-1) || (j==n-1 && i<n-1) || (j==0 && i<n ) || (i==j && i>(n-(n/2))) )
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//R
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if ((i == 0 ) || j==0 || (i == (n-1)/2 ) || (j == n-1 && i<n/2) || (i==j && i>=(n-(n/2))) )
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//S
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if ((i == 0 ) || j==0 && i<n/2 ||i==n-1|| (i == (n-1)/2 ) || (j == n-1 && i>=n/2) )
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//T
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if ((i == 0 ) || j==n/2 )
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");
//u
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if ((i == n-1 && j<=n/2 ) || j==n/2 || j==0)
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");
//v
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if ((i+1==j && i<n/2 )||(i+j==n-1 && i<n/2))
			System.out.print( "* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");
//W
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (j==0|| j==n-1||(i==j && i>=(n+1)/2)||(i+j==n-1 && i>=n/2))
			System.out.print( "* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");
//X
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if ((i==j )||(i+j==n-1))
			System.out.print( "* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//Y
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if ((i+1==j && i<n/2 )||(i+j==n-1 && i<n/2) || (j==n/2 && i>=n/2))
			System.out.print( "* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}

System.out.println("  ");


//z
for ( i = 0; i < n; i++) {
	for ( j = 0; j < n; j++) {

		if (i==0||i==n-1||(i+j==n-1))
			System.out.print( "* ");
		else
			System.out.print("  ");
	}
	System.out.println("  ");
}
System.out.println("  ");

//EOP
	}
}


