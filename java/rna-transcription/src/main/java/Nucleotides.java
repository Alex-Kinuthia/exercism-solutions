public enum Nucleotides {
    Adenine("U"),
    Cytosine("G"),
    Guanine("C"),
    Thymine("A"),
    Empty("");

    public static Nucleotides fromDna(String shorthand) {

        switch (shorthand) {
            case "C":
                return Cytosine;
            case "G":
                return Guanine;
            case "T":
                return Thymine;
            case "A":
                return Adenine;
        }
        return Empty;
    }

    public final String rnaComplement;

    Nucleotides(String rnaComplement) {
        this.rnaComplement = rnaComplement;
    }
}
