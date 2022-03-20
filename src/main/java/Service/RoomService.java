package Service;

import Dao.RoomDao;
import Entity.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomService implements RoomDao {

    @Override
    public List<Room> findAvaliable(List<Room> list, Date date) {
        List<Room> res = new ArrayList<>();
        if(list != null){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getAvaliable()!= null && list.get(i).getAvaliable()){
                    res.add(list.get(i));
                }
            }
        }
        return res;
    }
}
