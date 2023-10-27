package functionalInterfaces.supplier;

import java.util.function.LongSupplier;

public class LongSupplierSample {
    public static void main(String[] args) {
        LongSupplier longSupplier = ()->10L;
        System.out.println(longSupplier.getAsLong());
    }
}
