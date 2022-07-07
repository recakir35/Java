package day39_overriding;

public class OverridingChild extends OverridingParent{
    public void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {
        /* Bir obje oluşturulurken Data türü ve Constructor aynı classdan seçilmişse java direk o classa gider
        hem variable hemde method için o classda varsa kullanır, yoksa o classin parentlarına bakar
         */
        OverridingChild obj1 = new OverridingChild();
        obj1.method1();//Child class method1
        obj1.method2();//Parent Class Method2

        OverridingParent obj3 = new OverridingParent();
        obj3.method2();//Parent Class Method2
        obj3.method1();//Parent Class Method1

        /*
        Eğer Data türü Parent, Constructor Child class dan seçildiyse variablelarda yukarıdaki şekilde çalışmaya
        devam eder Ancak methodlar için Data turunun olduğu classdaki method Child class tarafından OVERRİDE
        edilmiş mi diye kontrol etmemiz gerekir Eger child classlarda bu method override edilmişse override eden method çalışır.
         */
        OverridingParent obj2 = new OverridingChild();
        obj2.method2();//Parent Class Method2
        obj2.method1();//Child class method1
    }
}
