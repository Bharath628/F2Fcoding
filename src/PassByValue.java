import model.TestSerialize;

public class PassByValue {

    public static void main(String[] args) {

        TestSerialize ts = new TestSerialize(1,"bharath");

        checkValue(ts);
        System.out.println(ts.getName());

    }

    private static void checkValue(final TestSerialize ts) {
        System.out.println(ts.getName());

        ts.setName("changed");

        System.out.println(ts.getName());
    }
}
