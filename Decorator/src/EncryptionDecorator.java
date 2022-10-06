import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator{

	public EncryptionDecorator(DataSource source) {
		super(source);
	}
	
	//--------------------------------------------------------
	
	@Override
	public void writeData(String data) {
		super.writeData(encode(data));
	}
	
	
	// Method for encoding used in writing
    private String encode(String data) {
    	
    	byte[] result = data.getBytes();
    	
    	for(int i = 0; i < result.length; i++) {
    		result[i] += (byte) 1;
    	}
    	
		return Base64.getEncoder().encodeToString(result);
	}
    
    //---------------------------------------------------------

	@Override
    public String readData() {
        return decode(super.readData());
    }

	
	// Method for decing used in reading encrypted string
	private String decode(String data) {
		
		byte[] result = Base64.getDecoder().decode(data);
		
		for (int i = 0; i < result.length; i++) {
			result[i] -= (byte) 1;
		}
		
		return new String(result);
		
	}
    
    

}
