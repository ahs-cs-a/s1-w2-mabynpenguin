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

    //instances using each constructor
    public static void main(String[] args) {
        BodyOfWater a = new BodyOfWater("Michigan", 118, 60, true);
        BodyofWater b = new BodyofWater("Tahoe", 22, 15, false);
        
        a.setName("Michigan");
        a.setlargestDiameter(118);

        b.setName("Tahoe");
        b.setlargestDiameter(22);

        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(a.getlargestDiameter());
        System.out.println(b.getlargestDiameter());
        System.out.println(a.getavgDepth());
        System.out.println(b.avgDepth());
        System.out.println(a.getisSaltWater());
        System.out.println(b.getisSaltWater());

        a.setName("Superior");
        System.out.println(a.getName());
    }

}
