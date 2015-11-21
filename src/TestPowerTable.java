import java.util.Scanner;

public class TestPowerTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PowerTable pTable = new PowerTable();
		int x = pTable.getFactor();
		int y = pTable.getFactor();
		String expression = pTable.getExpresion(x, y);
		System.out.println(expression);
		int result = sc.nextInt();
		System.out.println(pTable.checkAnswer(x, y, result));
		sc.close();
	}
}