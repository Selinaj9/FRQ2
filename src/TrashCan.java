public class TrashCan {
    private double capacity;
    private double trashAmount;

    //PRE-CONDITION: capacity >= 0
    public TrashCan(double capacity) {
        this.capacity = capacity;
        trashAmount = 0;
    }

    public double acceptTrash(double trashWeight) {
        if (trashAmount + trashWeight <= capacity) {
            trashAmount += trashWeight;
        } else {
            trashWeight -= capacity - trashAmount;
            trashAmount = trashWeight;
        }
        if (capacity == trashAmount) {
            trashAmount = 0;
        }
        return capacity - trashAmount;
    }

    //For testing only
    public double getCapacity() {
        return capacity;
    }

    public double getTrashAmount() {
        return trashAmount;
    }
}