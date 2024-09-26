package exceptionHandlingS;

public class PackException {
	int number1, number2, result, i;
	int a[] = new int[10];

	int divNum(int n1, int n2) {
		number1 = n1;
		number2 = n2;
		return result = number1 / number2;
	}

	int ArrayFlow() {
		int count = 0;
		for (i = 0; i <=5; i++) {
			a[i] = count;
			count = count + 1;
			System.out.println(a[i]);
		}
		return a[i];

	}

	public static void main(String[] args) {

		PackException p = new PackException();
		try {
			//p.divNum(20, 20);
			//System.out.println(p.result);
			p.ArrayFlow();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
