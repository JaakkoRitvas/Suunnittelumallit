
public abstract class DataSourceDecorator implements DataSource{
	
	private DataSource DStorageWrapped;
	
	public DataSourceDecorator(DataSource source) {
		this.DStorageWrapped = source;
	}

	@Override
	public void writeData(String data) {
		DStorageWrapped.writeData(data);
	}

	@Override
	public String readData() {
		return DStorageWrapped.readData();
	}
}