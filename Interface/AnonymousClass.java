// Anonymous class
public class AnonymousClass {
    public static void main(String[] args) {
        Checkable uc = new Checkable() {
            // ANynonymous class
            @Override
            public boolean check() {
                return true;
            }
        };
        System.out.println("Yes, it is " + uc.check());
    }
    
}
