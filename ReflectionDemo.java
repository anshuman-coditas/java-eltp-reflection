package ReflectionDemo;
import java.lang.reflect.*;
class Person{
        Person(){
            System.out.println("Default person.");
        }
}
class Student extends Person{
    public String name;
    public int id;
    public float marks;
    public Student(){
        System.out.println("Default Student.");
    }
    public Student(String name){
        System.out.println("Name is "+name);
    }
    public void show(){
        System.out.println("This is Student");
    }
}
public class ReflectionDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("Anshuman");
        ReflectionDemo obj_r=new ReflectionDemo();
        Class obj_cr=obj_r.getClass();
        Class obj = s.getClass();

        String name = obj.getName();
        String name1 = obj.getCanonicalName();
        String name2 = obj.toGenericString();
        String name3 = obj.getTypeName();
        String name4 = obj.getSimpleName();
        String name5 = obj.getPackageName();
        String name6 = obj.descriptorString();
        System.out.println(name);//getname
        System.out.println(name1);//getcanonicalname
        System.out.println(name2);//getgenericstring
        System.out.println(name3);//gettypename
        System.out.println(name4);//getsimplename
        System.out.println(name5);//getpackagename
        System.out.println(name6);//descriptorstring
        System.out.println("******************MODIFIERS");
        int modifier = obj.getModifiers();
        System.out.println(modifier);
        int modifier2Reflection=obj_cr.getModifiers();
        String mod3=Modifier.toString(modifier2Reflection);
        System.out.println("Modifier of ReflectionDemo " +mod3);
        System.out.println("*****************SUPERCLASS");
        Class superclass=obj.getSuperclass();
        System.out.println("Superclass is : "+superclass);
        System.out.println("***************CONSTRUCTORS");
        Constructor[] construct = obj.getConstructors();
        for (Constructor c : construct) {
            System.out.println("Constructor is : " + c.getName());

            int modifier2=c.getModifiers();
            String mod2=Modifier.toString(modifier2);
            System.out.println("Modifier is: "+mod2);

            System.out.println("Parameters are "+c.getParameterCount());
        }
        System.out.println("***************FIELDS");
     Field[] fields= obj.getFields();
        for(Field f:fields){
            System.out.println("Field is "+f.getName());

            int modifier3=f.getModifiers();
            System.out.println("Modifier is "+modifier3);
        }
    }
}
/*
Default person.
Default Student.
Default person.
Name is Anshuman
ReflectionDemo.Student
ReflectionDemo.Student
class ReflectionDemo.Student
ReflectionDemo.Student
Student
ReflectionDemo
LReflectionDemo/Student;
******************MODIFIERS
0
Modifier of ReflectionDemo public
*****************SUPERCLASS
Superclass is : class ReflectionDemo.Person
***************CONSTRUCTORS
Constructor is : ReflectionDemo.Student
Modifier is: public
Parameters are 0
Constructor is : ReflectionDemo.Student
Modifier is: public
Parameters are 1
***************FIELDS
Field is name
Modifier is 1
Field is id
Modifier is 1
Field is marks
Modifier is 1

 */