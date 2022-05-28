package projectTest;

public class LengthConverter {
	final private double BIT_TO_BIT = 1;
	final private double BYTE_TO_BIT = 8;
	final private double KBYTE_TO_BIT = 8192;
	final private double MBYTE_TO_BIT = 8388608;
	final private double GBYTE_TO_BIT = 8.5899e+9;
	final private double TBYTE_TO_BIT = 8.7961e+12;
	final private double PBYTE_TO_BIT = 9.0072e+15;
	final private double EBYTE_TO_BIT = 9.2234e+18;

	private double factor;
	
	public LengthConverter(String unit) {
		if(unit.equals("bit")) {
			factor = BIT_TO_BIT;
		}
		else if(unit.equals("byte")) {
			factor = BYTE_TO_BIT;
		}
		else if(unit.equals("kb")) {
			factor = KBYTE_TO_BIT;
		}
		else if(unit.equals("mb")) {
			factor = MBYTE_TO_BIT;
		}
		else if(unit.equals("gb")) {
			factor = GBYTE_TO_BIT;
		}
		else if(unit.equals("tb")) {
			factor = TBYTE_TO_BIT;
		}
		else if(unit.equals("pb")) {
			factor = PBYTE_TO_BIT;
		}
		else if(unit.equals("eb")) {
			factor = EBYTE_TO_BIT;
		}
	}
	// 비트 단위로 변환
	public double toBit(double measurement) {
		return (measurement * factor);
	}
	// 비트 단위에서 원하는 단위로 변환
	public double fromBit(double measurement) {
		return (measurement / factor);
	}
	
	
}
