class Controller {
    void openWindows(Building building) {
        for (Room room : building.rooms) {
            openWindows(room);
        }
        System.out.println("okna otwarte");
    }

    void openWindows(Room room) {
        room.window.open = true;
        System.out.println("otwieram okna w pokoju numer " + room.number);
    }

    void closeWindows(Room room) {
        room.window.open = false;
        System.out.println("zamykam okna w pokoju numer " + room.number);
    }
    void closeWindows(Integer number, Building building) {
        boolean exists = false;
        for (Room room : building.rooms) {
            if (room.number.equals(number)) {
                closeWindows(room);
                exists = true;
            }
        }
        if (!exists) {
            System.out.println("pokoj o tym numerze nie istnieje");
        }
    }

    void openWindows(Integer number, Building building) {
        boolean exists = false;
        for (Room room : building.rooms) {
            if (room.number.equals(number)) {
                openWindows(room);
                exists = true;
            }
        }
        if (!exists) {
            System.out.println("pokoj o tym numerze nie istnieje");
        }
    }

    void closeDoors(Integer number, Building building) {
        boolean exists = false;
        for (Room room : building.rooms) {
            if (room.number.equals(number)) {
                closeDoors(room);
                exists = true;
            }
        }
        if (!exists) {
            System.out.println("pokoj o tym numerze nie istnieje");
        }
    }

    void openDoors(Building building) {
        for (Room room : building.rooms) {
            openDoors(room);
        }
        System.out.println("drzwi otwarte");
    }

    void openDoors(Room room) {
        room.door.open = true;
        System.out.println("otwieram drzwi w pokoju numer " + room.number);
    }

    void closeDoors(Room room) {
        room.door.open = false;
        System.out.println("zamykam drzwi w pokoju numer " + room.number);
    }
}
