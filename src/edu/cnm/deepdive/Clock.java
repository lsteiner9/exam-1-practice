package edu.cnm.deepdive;

public class Clock {
  static final int DEG_PER_HOUR = 360 / 12;
  static final int DEG_PER_MIN = 360 / 60;

  public static int hourAngle(int hour, int minute) {
    return ((hour % 12) * (DEG_PER_HOUR) + (minute / 2));
  }

  public static int minuteAngle(int minute) {
    return (minute) * (DEG_PER_MIN);
  }
}
