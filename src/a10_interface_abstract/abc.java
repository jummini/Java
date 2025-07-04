package a10_interface_abstract;



public class abc {
    public static void main(String[] args) {

        abstract class A {
            abstract void abc();
        }

        class B extends A {
            @Override
            void abc() {
                System.out.println("안녕하세요");
            }
        }

    }
}

