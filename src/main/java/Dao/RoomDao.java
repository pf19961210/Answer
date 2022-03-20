package Dao;

import Entity.Room;

import java.util.Date;
import java.util.List;

public interface RoomDao {
    public List<Room> findAvaliable(List<Room> list, Date date);
}
