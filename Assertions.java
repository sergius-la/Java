// To enable assert in IDEA: Edit configurations -> into VM points put: -ea
public class ArrayTwo {

    public static void main(String[] args) {
        ArrayTwo arrayTwo = new ArrayTwo();
        arrayTwo.some(-1);
    }

    private void some(int a) {
   // -> assert(conditions);
        assert (a > 0);
        System.out.println(a);
    }
}    