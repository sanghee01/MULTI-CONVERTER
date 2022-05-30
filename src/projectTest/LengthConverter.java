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
      if(unit.equals("bit (비트)")) {
         factor = BIT_TO_BIT;
      }
      else if(unit.equals("byte (바이트)")) {
         factor = BYTE_TO_BIT;
      }
      else if(unit.equals("kb (킬로바이트)")) {
         factor = KBYTE_TO_BIT;
      }
      else if(unit.equals("mb (메가바이트)")) {
         factor = MBYTE_TO_BIT;
      }
      else if(unit.equals("gb (기가바이트)")) {
         factor = GBYTE_TO_BIT;
      }
      else if(unit.equals("tb (테라바이트)")) {
         factor = TBYTE_TO_BIT;
      }
      else if(unit.equals("pb (페타바이트)")) {
         factor = PBYTE_TO_BIT;
      }
      else if(unit.equals("eb (엑사바이트)")) {
         factor = EBYTE_TO_BIT;
      }
   }
   //   Ʈ          ȯ
   public double toBit(double measurement) {
      return (measurement * factor);
   }
   //   Ʈ             ϴ           ȯ
   public double fromBit(double measurement) {
      return (measurement / factor);
   }
   
   
}
