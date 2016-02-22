public class DataRegister extends LC3Component {

	String id;
	
	public DataRegister(String id) {
		this.id = id;
	}

	@Override
	public void onInputChange(byte[] input) {
		super.onInputChange(input);
		System.out.println(id);
		System.out.println("Most significant:\t"+data[0]);
		System.out.println("Least significant:\t"+data[1]);
	}
	
	
}
