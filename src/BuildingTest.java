import java.util.ArrayList;
import java.util.List;

class BuildingTest {
    public static void main(String[] args) {
        Door door1 = new Door(true, 80, 220);
        Window window1 = new Window(false, 120, 120);
        Door door2 = new Door(true, 80, 220);
        Window window2 = new Window(false, 180, 120);
        Room room1 = new Room(door1, window1,1);
        Room room2 = new Room(door2, window2,2);
        Room room3 = new Room(door2, window2,3);
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building building = new Building(rooms);
        Controller controller = new Controller();
        controller.openWindows(building);
        controller.closeDoors(3,building);
        controller.closeWindows(8,building);
        controller.openDoors(building);
        controller.openWindows(3,building);

    }
}