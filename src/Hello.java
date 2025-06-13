class chaining{
    chaining() {
        System.out.println("mai nhi hu naa");
    }
    chaining(int a){
        this();
        System.out.println(a);
    }
    chaining(int a, int b){
        this(5);
        System.out.println(a+b);
    }
}
class Hello{
    public static void main(String[] args){
        chaining obj = new chaining(5,10);
    }
}