import java.util.ArrayList;

public  class LC3Component implements ChangeListener, ChangeProvider {

	private ArrayList<LC3Component> dataOutputs;
	private ArrayList<LC3Component> dataInputs;
	
	protected byte[] data;
	
	public LC3Component() {
		dataOutputs = new ArrayList<LC3Component>();
		dataInputs = new ArrayList<LC3Component>();
	}
	
	public void setData(byte[] input){
		data = input;
		announceChange();
	}
	
	public byte[] getData() {
		return data;
	}
	
	public void addOutput(LC3Component listener) {
		dataOutputs.add(listener);
	}
	
	public boolean removeOutput(LC3Component listener) {
		return dataOutputs.remove(listener);
	}
	
	public void addInput(LC3Component provider) {
		dataInputs.add(provider);
	}
	
	public boolean removeInput(LC3Component provider) {
		return dataInputs.remove(provider);
	}
	
	@Override
	public void announceChange() {
		for (LC3Component listener: dataOutputs) {
			listener.onInputChange(data);
		}
	}

	@Override
	public void onInputChange(byte[] input) {
		setData(input);
	}
	
	
}
