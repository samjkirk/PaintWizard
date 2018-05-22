public class Room {
    public int size;

    public Room(int size) {
        setSize(size);
    }

    private void setSize(int size){ this.size = size; }

    public int getSize(Room room){ return room.size; }

}
