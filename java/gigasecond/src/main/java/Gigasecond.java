import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigInteger;

public class Gigasecond {
    private final LocalDateTime date;
  // calculate the moment when someone has lived for billion seconds
    private static final Long GIGASECOND = BigInteger
        .valueOf(10)
        .pow(9)
        .longValue();
// check for the moment of time (modern time and full time specified and day roll over)
    public Gigasecond(LocalDate date) {
        this(date.atStartOfDay());
    }

// for full time specified
    public Gigasecond(LocalDateTime date) {
        this.date = date;
    }

// for epoch tests
    public LocalDateTime getDate() {
        return date.plusSeconds(GIGASECOND);
    }
}
