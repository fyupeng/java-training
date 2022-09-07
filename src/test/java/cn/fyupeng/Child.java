package cn.fyupeng;

import java.lang.reflect.Method;

/**
 * @Auther: fyp
 * @Date: 2022/9/1
 * @Description:
 * @Package: cn.fyupeng
 * @Version: 1.0
 */
public class Child implements FatherInterface1, FatherInterface2 {

    public static void main(String[] args) {
        Class<Child> clazz = Child.class;
        System.out.println(clazz.getName());
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            for (Method method : anInterface.getMethods()) {
                System.out.println(method);
            }
        }
    }

    @Override
    public int method1ForFatherInterface1() {
        return 0;
    }

    @Override
    public void methodForFatherInterface1() {

    }

    @Override
    public int method1ForFatherInterface2() {
        return 0;
    }

    @Override
    public void methodForFatherInterface2() {

    }
}
