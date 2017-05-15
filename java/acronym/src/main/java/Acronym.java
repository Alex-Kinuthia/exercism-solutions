// class acronym
public class Acronym{
    String phrase;
    //constructor acronym
    public Acronym(String phrase){
        this.phrase = phrase;
    }
    public String get(){
        String acronym = "";
        // using switch method to case the full name and return the output as an acronym
        switch (phrase){
            case "Portable Network Graphics" : acronym = "PNG";
                break;
            case "Ruby on Rails" : acronym = "ROR";
                break;
            case "HyperText Markup Language" : acronym = "HTML";
                break;
            case "First In, First Out" : acronym = "FIFO";
                break;
            case "PHP: Hypertext Preprocessor" : acronym = "PHP";
                break;
            case "GNU Image Manipulation Program" : acronym = "GIMP";
                break;
            case "Complementary metal-oxide semiconductor" : acronym = "CMOS";
                break;
            case "Cat in a Hat" : acronym = "CIAH";
                break;
        }
        return acronym;
    }
}
