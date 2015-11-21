public class PowerTable {
	private int result;

	public PowerTable() {
	}

	public int getResult(int x, int y) {
		int result = x * y;
		return result;
	}

	public String getExpresion(int x, int y) {
		String exp = x + " * " + y + " = ";
		return exp;
	}

	public String checkAnswer(int x, int y, int result) {
		String answer;
		if (getResult(x, y) == result) {
			answer = "True!";
		} else
			answer = "False!";
		return answer;
	}

	public int getFactor() {
		int z = (int) (Math.random() * 7) + 2;
		return z;
	}
}