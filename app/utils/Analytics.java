package utils;

import java.util.HashMap;

public class Analytics {

  public static int beaufort;

  public static String windCompass;

  public static String wCodes(int code) {
    HashMap<Integer, String> wCodes = new HashMap<Integer, String>();
    wCodes.put(100, "Clear");
    wCodes.put(200, "Partial Clouds");
    wCodes.put(300, "Cloudy");
    wCodes.put(400, "Light Showers");
    wCodes.put(500, "Heavy Showers");
    wCodes.put(600, "Rain");
    wCodes.put(700, "Snow");
    wCodes.put(800, "Thunder");
    return wCodes.get(code);
  }


  public static String icons(int code) {
    HashMap<Integer, String> icons = new HashMap<Integer, String>();
    icons.put(100, "large orange sun outline icon right floated");
    icons.put(200, "large light blue cloud sun icon right floated");
    icons.put(300, "large grey cloud icon right floated");
    icons.put(400, "large blue cloud rain icon right floated");
    icons.put(500, "large grey cloud showers heavy icon right floated");
    icons.put(600, "large purple umbrella icon right floated");
    icons.put(700, "large pink snowflake outline icon right floated");
    icons.put(800, "large yellow bolt icon right floated");
    return icons.get(code);
  }

  public static int beaufort(float windSpeed) {
    float speed = windSpeed;
    if (speed == 1) {
      beaufort = 0;
    } else if (speed > 1 & speed <= 5) {
      beaufort = 1;
    } else if (speed > 5 & speed <= 11) {
      beaufort = 2;
    } else if (speed > 11 & speed <= 19) {
      beaufort = 3;
    } else if (speed > 19 & speed <= 28) {
      beaufort = 4;
    } else if (speed > 28 & speed <= 38) {
      beaufort = 5;
    } else if (speed > 38 & speed <= 49) {
      beaufort = 6;
    } else if (speed > 49 & speed <= 61) {
      beaufort = 7;
    } else if (speed > 61 & speed <= 74) {
      beaufort = 8;
    } else if (speed > 74 & speed <= 88) {
      beaufort = 9;
    } else if (speed > 88 & speed <= 102) {
      beaufort = 10;
    } else if (speed > 102 & speed <= 117) {
      beaufort = 11;
    }
    return (int) beaufort;
  }


  public static String windCompass(int windDirection) {
    int direction = windDirection;
    // N = 0 to 11.25 / 348.75 to 360
    if ((direction >= 0 & direction <= 11.25) && (direction >= 348.75 & direction <= 360)) {
      return "North";
    }

    // NNE = 11.26 to 33.75
    else if (direction > 11.25 & direction <= 33.75) {
      return "North-northeast";
    }

    // NE = 33.76 to 56.25
    else if (direction > 33.75 & direction <= 56.25) {
      return "Northeast";
    }

    // ENE = 56.26 to 78.75
    else if (direction > 56.25 & direction <= 78.75) {
      return "East-northeast ";
    }

    // E = 78.76 to 101.25
    else if (direction > 78.75 & direction <= 101.25) {
      return "East";
    }

    // ESE = 101.26 to 123.75
    else if (direction > 101.25 & direction <= 123.75) {
      return "East-southeast";
    }

    // SE = 123.76 to 146.25
    else if (direction > 123.75 & direction <= 146.25) {
      return "Southeast";
    }

    // SSE = 146.26 to 168.75
    else if (direction > 146.25 & direction <= 168.75) {
      return "South-southeast";
    }

    // S = 168.76 to 191.25
    else if (direction > 168.75 & direction <= 191.25) {
      return "South";
    }

    // SSW = 191.26 to 213.75
    else if (direction > 191.25 & direction <= 213.75) {
      return "South-southwest";
    }

    // SW = 213.76 to 236.25
    else if (direction > 213.75 & direction <= 236.25) {
      return "Southwest";
    }

    // WSW = 236.26 to 258.75
    else if (direction > 236.25 & direction <= 258.75) {
      return "West-southwest";
    }

    // W = 258.76 to 281.25
    else if (direction > 258.75 & direction <= 281.25) {
      return "West";
    }

    // WNW = 281.26 to 303.75
    else if (direction > 281.25 & direction <= 303.75) {
      return "West-northwest";
    }

    // NW = 303.76 to 326.25
    else if (direction > 303.75 & direction <= 326.25) {
      return "Northwest";
    }

    // NNW = 326.26 to 348.75
    else if (direction > 326.25 & direction <= 348.75) {
      return "North-northwest";
    }
    return windCompass;

  }


  public static float windChill(float temperature, float windSpeed) {
    float chill;
    float vFactor;
    vFactor = (float) Math.pow(windSpeed, 0.16);
    chill = (float) (13.12 + (0.6215 * temperature) - (11.37 * vFactor) + (0.3965 * temperature * vFactor));
    return chill;
  }
}

    /*


    private int minTemp;
    private int maxTemp;

    private String description;


    public void setMinTemp(int value) {
        this.minTemp = value;
    }

    /**
     * Sets maximum temperature.
     *
     * @param value
     *            the temperature in Kelvin
     */

/*
    public void setMaxTemp(int value) {
        this.maxTemp = value;
    }


    public void setDescription(String description) {
        this.description = description;
    }



    public String getTemp(boolean cels) {
        int tempInt = WeatherCondition.temperatureUnit(temperature, cels);
        return Integer.toString(tempInt);
    }


    public String getMinTemp(boolean cels) {
        int tempInt = WeatherCondition.temperatureUnit(minTemp, cels);
        return Integer.toString(tempInt);
    }

    /**
     * Returns the maximum temperature in the preferred unit.
     *
     * @param cels
     *            Celsius if true; Farhenheit if false
     * @return temperature in the preferred unit
     */

/*
    public String getMaxTemp(boolean cels) {
        int tempInt = WeatherCondition.temperatureUnit(maxTemp, cels);
        return Integer.toString(tempInt);
    }

    public String getDescription() {
        return description;
    }




    public float farenheit() {
        return ((this.temperature * 9)/5) + 32;
    }

}

*/


