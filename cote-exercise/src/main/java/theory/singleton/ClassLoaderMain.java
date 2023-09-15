package theory.singleton;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception {
        String className = "theory.singleton.SuperCar";
        Class<?> clazz = Class.forName(className);
        Object o = clazz.newInstance();

        Method method = clazz.getDeclaredMethod("a", null);
        method.invoke(o, null);
    }
}
