package lesson33_overriding;
public class C01_Override {
    public void method1(){
        System.out.println("parent method 1 ");
    }
    protected void method2(){
        System.out.println("parent method 2 ");
    }
    protected String method3 (){
        return "Parent Java";
    }
    private void method4(){
        System.out.println("Parent method4");
    }
}