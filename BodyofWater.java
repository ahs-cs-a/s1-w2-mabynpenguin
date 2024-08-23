public class BodyofWater {
    private String name;
    private double largestDiameter;
    private double avgDepth;
    private boolean isSaltWater;

    public BodyofWater(String n, double ld, double ad, boolean sw){
        name = n;
        largestDiameter = ld;
        avgDepth = ad;
        isSaltWater = sw;
    }

    public BodyofWater(String n, double ad){
        name = n;
        avgDepth = ad;
    }
    // getter methods
    public String name(){
        return name;
    }

    public double largestDiameter(){
        return largestDiameter;
    }

    public double avgDepth(){
        return avgDepth;
    }

    public boolean isSaltWater(){
        return isSaltWater;
    }

    //set method, name and largestDiameter
    public void setName(String n){
        name = n;
    }

    public void setlargestDiameter(double ld){
        largestDiameter = ld;
    }

    public void setavgDepth(double ad){
        avgDepth = ad;
    }

    public void isSaltWater(boolean sw){
        isSaltWater = sw;
    }

}
