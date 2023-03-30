// ANDI CHUSNUL IDZAH 13020210170


interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0170 implements A, B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        System.out.println("main");
        Central0170 obj = new Central0170();
        obj.aaa();
    }
}