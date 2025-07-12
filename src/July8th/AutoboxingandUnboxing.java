package July8th;

public class AutoboxingandUnboxing {

    public static void main(String[] args)
    {
        // Primitive int
        int primitive = 50;
        System.out.println("Primitive: " + primitive);

        // Autoboxing: int to Integer
        Integer wrapper = primitive;
        System.out.println("Wrapper: " + wrapper);

        // Unboxing: Integer to int
        int unboxed = wrapper;
        System.out.println("Unboxed again: " + unboxed);
    }
}
