import java.io.*;

public class Hamming {

  private String dna_a, dna_b;

  public Hamming(String dna_a, String dna_b) throws IllegalArgumentException {
    if (dna_a.length() != dna_b.length()) {
      throw new IllegalArgumentException();
    }

    this.dna_a = dna_a;
    this.dna_b = dna_b;
  }

  public Integer getHammingDistance() {
      Integer distance = 0;
      // if(dna_a.length() != dna_b.length())
      //    throw new IllegalArgumentException("DNA strands must be of equal length.");
      for(int i = 0; i < dna_a.length(); i++) {
          if(dna_a.charAt(i) != dna_b.charAt(i))
              distance++;
      }
      return distance;
  }

}
