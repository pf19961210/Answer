package Dao;

import Entity.Room;

import java.util.List;

public interface GuestDao {

    public List<Room> findAll(List<Room> list, int gid);
}
