package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CubeRootTest {

  static final long[] inputValues = {
      -1,
      0,
      1,
      8,
      9,
      27,
      1331,
      1330,
      1332
  };

  static final boolean[] expectedValues = {
      true,
      true,
      true,
      true,
      false,
      true,
      true,
      false,
      false
  };

  @Test
  void isCubeTest() {
    CubeRoot cubeRoot = new CubeRoot();
    for (int i = 0; i < inputValues.length; i++) {
      boolean expected = expectedValues[i];
      boolean actual = cubeRoot.isCube(inputValues[i]);
      assertEquals(expected, actual);
    }
  }

}