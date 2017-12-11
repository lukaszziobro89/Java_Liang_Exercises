package Chapter_12.Chapter_Classes;
/** Own exception for Hex2Dec class */
public class HexFormatException extends NumberFormatException {
    public HexFormatException(String msg){
        super(msg);
    }
}
