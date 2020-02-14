public class AnonymoursExample {
    public static void main(String args[]) {
        AnonymoursExample.AnonymousInner inner = new AnonymoursExample.AnonymousInner() {
            public void mymethod() {
                System.out.println("This is an example of anonymous inner class");
            }
        };
        inner.mymethod();
    }
    abstract static class AnonymousInner {
        public abstract void mymethod();
    }

}


/*
public class Outer_class {

    public static void main(String args[]) {
        AnonymoursExample.AnonymousInner inner = new AnonymoursExample.AnonymousInner() {
            public void mymethod() {
                System.out.println("This is an example of anonymous inner class");
            }
        };
        inner.mymethod();
    }
}
*/
