package controllers;

import java.util.List;

import models.Station;
import models.Reading;
import play.Logger;
import play.mvc.Controller;

public class StationlistCtrl extends Controller {
  public static void index(Long id) {
    Station station = Station.findById(id);
    Logger.info("Station id = " + id);
    render("station.html", station);


//    List<Reading> readings = Reading.findAll();
//    Reading lastReading = readings.get(readings.size() - 1);
//
//    // lastReading.
//    StationSummary summary = new StationSummary(station, lastReading);
//
//    render("station.html", summary);

  }

  public static void deletereading(Long id, Long readingid) {
    Station station = Station.findById(id);
    Reading reading = Reading.findById(readingid);
    Logger.info("Removing" + reading.code);
    station.readings.remove(reading);
    station.save();
    reading.delete();
    render("station.html", station);
  }

  public static void addReading(Long id, int code, float temperature, float windSpeed, int windDirection, int pressure) {
    Reading reading = new Reading(code, temperature, windSpeed, windDirection, pressure);
    Station station = Station.findById(id);
    station.readings.add(reading);
    station.save();
    redirect("/stations/" + id);
  }
}
