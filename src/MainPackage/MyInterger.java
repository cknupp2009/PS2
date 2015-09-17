package MainPackage;

public class MyInterger {
	private int value;
	int[] anArray;

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if (this.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (this.getValue() % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime() {
		for (int i = 3; i * i < (this.getValue()); i += 2) {
			if (this.getValue() % i == 0) {
				return false;
			}
		}
		if (this.getValue() % 2 == 0) {
			return false;
		}
		 else {
			return true;
		}
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int value) {
		if (value % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int value) {
		for (int i = 3; i * i < (value); i += 2) {
			if (value % i == 0) {
				return false;
			}
		}

	}

	public static boolean isEven(MyInterger value) {
		if (value.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInterger value) {
		if (value.getValue() % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isPrime(MyInterger value) {
		for (int i = 3; i * i < (value.getValue()); i += 2) {
			if (value.getValue() % i == 0) {
				return false;
			}
		}
		if (value.getValue() % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean equals() {
		int num;
		if ((this.getValue()) == num) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean equals(MyInterger value){
		int num1;
		if (value.getValue() == num1){
			return true;
		}
		else{
			return false;
		}
	}

	public static void parseInt(char[])
	{
		char temp;
		char temp2;
		char [] changeArray = new char [temp.getValue];
		temp2 = Integer.parseInt(temp);
		
	}

	public static void parseInt2(String){
		String temp;
		String temp2;
		String [] changeArray = new string [temp.getValue];
		temp2 = Integer.parseInt(changeArray);
	}

}