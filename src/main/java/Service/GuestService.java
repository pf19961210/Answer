package Service;

import Dao.GuestDao;
import Entity.Room;

import java.util.ArrayList;
import java.util.List;

public class GuestService implements GuestDao {

    @Override
    public List<Room> findAll(List<Room> list, int gid) {
        List<Room> res = new ArrayList<>();
        if(list != null){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getGid() !=null && list.get(i).getGid().equals(gid)){
                    res.add(list.get(i));
                }
            }
        }
        return res;
    }


}
