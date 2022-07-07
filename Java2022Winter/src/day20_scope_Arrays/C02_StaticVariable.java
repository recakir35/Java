package day20_scope_Arrays;

public class C02_StaticVariable {

    // instance variablelar obje'ye bağımlıdır ve her obje farklı değerler alabilir
    // öğrenci notları veya öğretmen branşları gibi
    //bir ob
    static String okulIsmi="Yıldız Koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {
        System.out.println(okulIsmi);// Yıldız Koleji
        System.out.println(okulNo);//0
        okulNo=102;
        System.out.println(okulNo);//102
        System.out.println(okulAcikMi);//false

        staticMethod();
        System.out.println(okulNo);
    }

    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo); //200
    }
}
