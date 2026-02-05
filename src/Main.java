public class Main {
    public static void main(String[] args) {
        String info;
        System.out.println("---- CupcakeMachine 1 tests ----");
        CupcakeMachine c1 = new CupcakeMachine(10, 1.75);
        System.out.println(c1.getAvailCupcakes() + "  " + c1.getCupcakeCost() + "  " + c1.getOrderNum());
        info = c1.takeOrder(2);
        System.out.println(info);
        System.out.println(c1.getAvailCupcakes() + "  " + c1.getCupcakeCost() + "  " + c1.getOrderNum());
        info = c1.takeOrder(3);
        System.out.println(info);
        System.out.println(c1.getAvailCupcakes() + "  " + c1.getCupcakeCost() + "  " + c1.getOrderNum());
        info = c1.takeOrder(10);
        System.out.println(info);
        System.out.println(c1.getAvailCupcakes() + "  " + c1.getCupcakeCost() + "  " + c1.getOrderNum());
        info = c1.takeOrder(1);
        System.out.println(info);
        System.out.println(c1.getAvailCupcakes() + "  " + c1.getCupcakeCost() + "  " + c1.getOrderNum());
        System.out.println();
        
        System.out.println("---- CupcakeMachine 2 tests ----");
        CupcakeMachine c2 = new CupcakeMachine(10, 1.5);
        System.out.println(c2.getAvailCupcakes() + "  " + c2.getCupcakeCost() + "  " + c2.getOrderNum());
        info = c2.takeOrder(10);
        System.out.println(info);
        System.out.println(c2.getAvailCupcakes() + "  " + c2.getCupcakeCost() + "  " + c2.getOrderNum());
        System.out.println();

        System.out.println("---- CupcakeMachine 3 tests ----");
        CupcakeMachine c3 = new CupcakeMachine(10, 2);
        System.out.println(c3.getAvailCupcakes() + "  " + c3.getCupcakeCost() + "  " + c3.getOrderNum());
        info = c3.takeOrder(4);
        System.out.println(info);
        System.out.println(c3.getAvailCupcakes() + "  " + c3.getCupcakeCost() + "  " + c3.getOrderNum());
        info = c3.takeOrder(3);
        System.out.println(info);
        System.out.println(c3.getAvailCupcakes() + "  " + c3.getCupcakeCost() + "  " + c3.getOrderNum());
        info = c3.takeOrder(5);
        System.out.println(info);
        System.out.println(c3.getAvailCupcakes() + "  " + c3.getCupcakeCost() + "  " + c3.getOrderNum());
        info = c3.takeOrder(3);
        System.out.println(info);
        System.out.println(c3.getAvailCupcakes() + "  " + c3.getCupcakeCost() + "  " + c3.getOrderNum());
    }
}