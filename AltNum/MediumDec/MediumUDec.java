import java.math.BigInteger;

package BlazesRusCode.AltNum;

	// Represents 0 - 4294967295.999999999 with 100% consistency of accuracy for most operations as long as don't get too small
	// (8 bytes worth of Variable Storage inside class for each instance)
	public class MediumUDec
	{
		
	//region DigitStorage

		//Stores whole half of number(value range 0 - 4294967295)
		private int IntHalf;
		
		//Stores decimal section info and other special info(value range 0-999999999)
		private int DecimalHalf;

		// Return IntHalf as signed int
		public int GetIntHalf() {
			return IntHalf;
		}

		// Return DecimalHalf as signed int
		public int GetDecHalf() {
			return DecimalHalf;
		}

	//endregion DigitStorage

		// The decimal overflow
		public static final int DecimalOverflow = 1000000000;

		// The decimal overflow
		public static final long DecimalOverflowX = 1000000000;

	//region class_constructors

		// Initializes a new instance of the MediumUDec class.
		public MediumUDec(int intVal, int decVal) {
			this.IntHalf = intVal;
			this.DecimalHalf = decVal;
		}

		public MediumUDec() {
			this(0, 0);
		}

		public MediumUDec assign(MediumUDec rhs) {
			if (this == rhs) {
				return this; // Check for self-assignment
			}
			this.IntHalf = rhs.IntHalf;
			this.DecimalHalf = rhs.DecimalHalf;
			return this;
		}

		public MediumUDec assign(int rhs) {
			this.IntHalf = rhs;
			this.DecimalHalf = 0;
			return this;
		}

		public void SetValue(MediumUDec rValue) {
			this.IntHalf = rValue.IntHalf;
			this.DecimalHalf = rValue.DecimalHalf;
		}

		public MediumUDec Initialize(int intVal, int decVal) {
			return new MediumUDec(intVal, decVal);
		}

		public MediumUDec getVariant(MediumUDec variantValue) {
			return new MediumUDec(variantValue.IntHalf, variantValue.DecimalHalf);
		}

	//endregion class_constructors


	}