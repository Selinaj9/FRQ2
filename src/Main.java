public class Main {
    public static void main(String[] args) {
        double remaining;
        System.out.println("---- TrashCan 1 Tests ----");
        TrashCan kitchen = new TrashCan(10.0);
        System.out.println(kitchen.getCapacity() + "  " + kitchen.getTrashAmount());
        remaining = kitchen.acceptTrash(2.5);
        System.out.println(remaining);
        System.out.println(kitchen.getCapacity() + "  " + kitchen.getTrashAmount());
        remaining = kitchen.acceptTrash(3.5);
        System.out.println(remaining);
        System.out.println(kitchen.getCapacity() + "  " + kitchen.getTrashAmount());
        remaining = kitchen.acceptTrash(6.0);
        System.out.println(remaining);
        System.out.println(kitchen.getCapacity() + "  " + kitchen.getTrashAmount());
        System.out.println();


        System.out.println("---- TrashCan 2 Tests ----");
        TrashCan bedroom = new TrashCan(3.0);
        System.out.println(bedroom.getCapacity() + "  " + bedroom.getTrashAmount());
        remaining = bedroom.acceptTrash(1.0);
        System.out.println(remaining);
        System.out.println(bedroom.getCapacity() + "  " + bedroom.getTrashAmount());
        remaining = bedroom.acceptTrash(3.2);
        System.out.println(remaining);
        System.out.println(bedroom.getCapacity() + "  " + bedroom.getTrashAmount());
        System.out.println();


        System.out.println("---- TrashCan 3 Tests ----");
        TrashCan livingRoom = new TrashCan(30.0);
        System.out.println(livingRoom.getCapacity() + "  " + livingRoom.getTrashAmount());
        remaining = livingRoom.acceptTrash(5.0);
        System.out.println(remaining);
        System.out.println(livingRoom.getCapacity() + "  " + livingRoom.getTrashAmount());
        remaining = livingRoom.acceptTrash(12.5);
        System.out.println(remaining);
        System.out.println(livingRoom.getCapacity() + "  " + livingRoom.getTrashAmount());
        remaining = livingRoom.acceptTrash(8.0);
        System.out.println(remaining);
        System.out.println(livingRoom.getCapacity() + "  " + livingRoom.getTrashAmount());
        remaining = livingRoom.acceptTrash(4.5);
        System.out.println(remaining);
        System.out.println(livingRoom.getCapacity() + "  " + livingRoom.getTrashAmount());
        remaining = livingRoom.acceptTrash(7.0);
        System.out.println(remaining);
        System.out.println(livingRoom.getCapacity() + "  " + livingRoom.getTrashAmount());
    }
}