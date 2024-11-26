import java.math.BigInteger;

public class SmallUDec {
    
    // Used to store value range between 0 - 33554431.99 for things like receipts
    private int IntHalf; // Stores whole half of number (value range 0-33554431)
    private int DecimalHalf; // Stores decimal section info (value range 0-99)

    // The decimal overflow
    public static final int DecimalOverflow = 100;

    // The decimal overflow
    public static final long DecimalOverflowX = 100;

    // Initializes a new instance of the SmallUDec class.
    public SmallUDec(int intVal, int decVal) {
        this.IntHalf = intVal;
        this.DecimalHalf = decVal;
    }

    public SmallUDec() {
        this(0, 0);
    }

    // Return IntHalf as unsigned int
    public int GetIntHalf() {
        return IntHalf;
    }

    // Return DecimalHalf as unsigned char
    public int GetDecHalf() {
        return DecimalHalf;
    }

    public void SetValue(SmallUDec rValue) {
        this.IntHalf = rValue.IntHalf;
        this.DecimalHalf = rValue.DecimalHalf;
    }

    public SmallUDec Initialize(int intVal, int decVal) {
        return new SmallUDec(intVal, decVal);
    }

    public SmallUDec getVariant(SmallUDec variantValue) {
        return new SmallUDec(variantValue.IntHalf, variantValue.DecimalHalf);
    }

    public SmallUDec assign(SmallUDec rhs) {
        if (this == rhs) {
            return this; // Check for self-assignment
        }
        this.IntHalf = rhs.IntHalf;
        this.DecimalHalf = rhs.DecimalHalf;
        return this;
    }

    public SmallUDec assign(int rhs) {
        this.IntHalf = rhs;
        this.DecimalHalf = 0;
        return this;
    }
}