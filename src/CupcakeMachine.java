public class CupcakeMachine {
    private int stock;
    private double cost;

    public CupcakeMachine(int s, double c) {
        stock = s;
        cost = c;
    }

    public String takeOrder(int order) {
        return "orderinfo";
    }
}