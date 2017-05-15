public class RnaTranscription {

    public String ofDna(String dnaStrand) {
        String rnaStrand = "";
        for (String Nucleotide : dnaStrand.split("")) {
            rnaStrand += rnaFromDna(Nucleotide);
        }
        return rnaStrand;
    }

    private String rnaFromDna(String NucleotideShorthand) {
        return Nucleotides.fromDna(NucleotideShorthand).rnaComplement;
    }

}
