package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;
import utils.Analytics;

@Entity
public class Reading extends Model
{
  public Date date;
  public int code;
  public static float temperature;
  public float windSpeed;
  public int windDirection;
  public int pressure;

  public static String wCodes;

  public static String convertWindDir;


  public Reading(int code, float temperature, float windSpeed, int windDirection, int pressure)
  {
    this.date = new Date(System.currentTimeMillis());
    this.code = code;
    this.temperature = temperature;
    this.windSpeed = windSpeed;
    this.windDirection = windDirection;
    this.pressure = pressure;
  }


  public String getWCodes(){
    return Analytics.wCodes(code);
  }

  public float fahrenheit() {
        return ((temperature * 9)/5) + 32;
    }


  public int getBeaufort(){
    return Analytics.beaufort(windSpeed);
  }

  public String getConvertWindDir(){
    return Analytics.windCompass(windDirection);
  }


  public float getWChill() {
    return Analytics.windChill(temperature, windSpeed);
  }

}
