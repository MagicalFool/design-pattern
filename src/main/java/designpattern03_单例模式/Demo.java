package designpattern03_单例模式;

public class Demo {

    public static void main(String[] args) {
        //  Singleton_m1 m1 = new Singleton_m1();
//        // 单线程下测试
//        Singleton_m1[] m1 = new Singleton_m1[2];
//
//        m1[0] = Singleton_m1.getInstance();
//        m1[1] = Singleton_m1.getInstance();
//
//        System.out.println(m1[0] == m1[1]);
//
//        final Singleton_m1[] m3 = new Singleton_m1[2];
//       // 多线程下测试 发现可能是false 可能是true 不安全
//        Thread t1 = new Thread(new Runnable() {
//            public void run() {
//                Singleton_m1 temp = Singleton_m1.getInstance();
//                m3[0] = temp;
//            }
//        });
//
//
//        Thread t2 = new Thread(new Runnable() {
//            public void run() {
//                Singleton_m1 temp = Singleton_m1.getInstance();
//                m3[1] = temp;
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        System.out.println(m3[0] == m3[1]);

        // 饿汉式
        Singleton_m2 m21 = (Singleton_m2) Singleton_m2.getInstance();
        Singleton_m2 m22 = (Singleton_m2) Singleton_m2.getInstance();

        System.out.println(m21 == m22);

        final Singleton_m2[] m3 = new Singleton_m2[2];
        // 多线程下测试 发现可能是false 可能是true 不安全
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                Singleton_m2 temp = (Singleton_m2) Singleton_m2.getInstance();
                m3[0] = temp;
            }
        });


        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Singleton_m2 temp = (Singleton_m2) Singleton_m2.getInstance();
                m3[1] = temp;
            }
        });

        t1.start();
        t2.start();

        System.out.println(m3[0] == m3[1]);
    }
}
