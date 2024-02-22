package model;

import java.sql.Date;

public class YoungestEldestWorker {
    String type;
    String name;
    Date birthday;

    public YoungestEldestWorker(String type, String name, Date birthday) {
        this.type = type;
        this.name = name;
        this.birthday = birthday;
    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }


    @Override
    public String toString() {
        return type + " worker: " + '\'' +
                "name='" + name + '\'' +
                ", birthday='" + birthday;
    }
}
