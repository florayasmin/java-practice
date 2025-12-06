// A class that keeps track of information for an admissions candidate
public class AdmissionsEntry implements Comparable<AdmissionsEntry> {
  private String id;
  private double total;
  private int ratings;
  private boolean discuss;

  public AdmissionsEntry(String id) {
    this.id = id;
    this.total = 0;
    this.ratings = 0;
    this.discuss = false;
  }

  public void rate(double rating) {
    if (rating < 0.0 || rating > 5.0) {
      throw new IllegalArgumentException("Rating must be between 0.0 and 5.0.");
    }
    ratings++;
    total += rating;
    if (rating >= 4.0) {
      discuss = true;
    }
  }

  public void flag() {
    discuss = true;
  }

  public String getID() {
    return id;
  }

  public double getRating() {
    if (ratings == 0) {
      return 0.0;
    } else {
      return total / ratings;
    }
  }

  public String toString() {
    double avgRating = Math.round(100 * getRating()) / 100;
    return id + ": " + avgRating;
  }
  
  public int compareTo(AdmissionsEntry other) {
    if (this.discuss && !other.discuss) {
      return -1;
    } else if (!this.discuss && other.discuss) {
      return 1;
    } else if (this.getRating() > other.getRating()) {
      return -1;
    } else if (this.getRating() < other.getRating()) {
      return 1;
    } else {
      return this.id.compareTo(other.id);
    }
  }
}
