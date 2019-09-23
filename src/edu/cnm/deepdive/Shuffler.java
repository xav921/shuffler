package edu.cnm.deepdive;

import java.util.Random;

public class Shuffler {

  private final Random rng;

  public Shuffler(Random rng) {
    this.rng = rng;
  }

  public void shuffle(int [] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      int temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;
    }
  }

  public void shuffle(byte [] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      byte temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;
    }
  }
}


