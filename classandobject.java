class Student{
    String name="harshit";
    void sum(int a,int b){
        System.out.println(a+b);
    }
}
class classandobject{
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        System.out.println(s1.name);
        s1.sum(10,20);
    }
}