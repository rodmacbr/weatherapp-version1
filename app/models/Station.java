package models;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;


@Entity
public class Station extends Model {

  public String name;

  public float longitude;

  public float latitude;


  @OneToMany(cascade = CascadeType.ALL)
  public List<Reading> readings = new ArrayList<Reading>();

/*
  public Reading getLatestReading() {
    return this.readings.get(this.readings.size() - 1);
  }
*/

  public Reading getLatestReading() {
    Reading latestReading = null;
    if (readings.size() > 0) {
      latestReading = readings.get(readings.size() - 1);
    }
    return latestReading;
  }


  public Station(String name, float latitude, float longitude) {
    this.name = name;
    this.latitude = latitude;
    this.longitude = longitude;
  }

}