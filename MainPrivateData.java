package ReflectionDemo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class CatPrivate
{
    private String color;
}
public class MainPrivateData {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

        CatPrivate obj_c=new CatPrivate();
        Class obj=obj_c.getClass();
        //access fields of class and print details

        Field field1=obj.getDeclaredField("color");
        field1.setAccessible(true);
        field1.set(obj_c, "frawn");

        String typevalue= (String) field1.get(obj_c);
        System.out.println("Value of Color is: "+typevalue);
        //modifier
        int modifier=field1.getModifiers();
        String mod=Modifier.toString(modifier);
        System.out.println("Modifier is::"+mod);
    }

}
/*
Value of Color is: frawn
Modifier is::private

 */
