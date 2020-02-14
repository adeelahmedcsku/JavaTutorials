import com.sun.xml.internal.fastinfoset.sax.SystemIdResolver;

import java.lang.reflect.Method;

public class InnerClassesExample {

    public static void main(String[] args){

        OuterClass obj_outerClass = new OuterClass();
        obj_outerClass.my_Method();
    }
}

class OuterClass{

    void my_Method()
    {
        int num=123;
        class MethodInner_Class{

            public void Print(){
                System.out.println("This is method inner class"+num);
            }
        }
        MethodInner_Class innerdemo=new MethodInner_Class();
        innerdemo.Print();
    }

}
