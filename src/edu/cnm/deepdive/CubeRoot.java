package edu.cnm.deepdive;

public class CubeRoot {

  public static boolean isCube (long n) {
    double root = Math.cbrt(n);
    long rounded = Math.round(root);
    return (rounded * rounded * rounded == n);
  };

}
