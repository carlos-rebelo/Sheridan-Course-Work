package motel;

public class Start {
    public static void main(String[] args)
    {

        Room[] roomConfiguration = {
                new Room(RoomType.SINGLE),
                new Room(RoomType.SINGLE),
                new Room(RoomType.DOUBLE),
                new Room(RoomType.DOUBLE),
                new Room(RoomType.DOUBLE),
                new Room(RoomType.SUITE),
                new Room(RoomType.SUITE),
                new Room(RoomType.SUITE)
        };

        Motel motel = new Motel("Notel", roomConfiguration);

    }
}
