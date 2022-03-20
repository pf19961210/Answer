package Entity;

import java.util.Date;

public class Booking {

    private Integer bid;
    private Integer gid;
    private Integer rnum;
    private String gname;
    private Date date;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getRnum() {
        return rnum;
    }

    public void setRnum(Integer rnum) {
        this.rnum = rnum;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
