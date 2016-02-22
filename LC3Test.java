
public class LC3Test {

	public static void main(String[] args) {
		DataRegister d1 = new DataRegister("REG1");
		DataRegister d2 = new DataRegister("REG2");
		byte[] test1 = {127, 0};
		byte[] test2 = {64, 127};
		byte[] test3 = {124, 3};
		d1.setData(test1);
		d1.addInput(d2);
		d2.addOutput(d1);
		d2.setData(test2);
		d2.setData(test3);
		d2.setData(test1);
	}
}
