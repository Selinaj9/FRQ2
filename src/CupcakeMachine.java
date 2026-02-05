public class CupcakeMachine {
    private int stock;
    private double cost;
    private int num = 1;

    public CupcakeMachine(int s, double c) {
        stock = s;
        cost = c;
    }

    public String takeOrder(int order) {
        if (order <= stock) {
            num ++;
            stock -= order;
            return "Order number " + (num - 1) + ", cost $" + order * cost;
        } else {
            return "Order cannot be filled";
        }
    }

    public int getAvailCupcakes() {
        return stock;
    }

    public double getCupcakeCost() {
        return cost;
    }

    public int getOrderNum() {
        return num;
    }
}