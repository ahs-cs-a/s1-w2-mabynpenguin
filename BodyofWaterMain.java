    public class BodyofWaterMain {
        public static void main(String[] args) {
            BodyofWater a = new BodyofWater("Michigan", 118, 60, true);
            BodyofWater b = new BodyofWater("Tahoe", 22, 15, false);
            
            a.setName("Michigan");
            a.setlargestDiameter(118);
    
            b.setName("Tahoe");
            b.setlargestDiameter(22);
    
            System.out.println(a.name());
            System.out.println(b.name());
            System.out.println(a.largestDiameter());
            System.out.println(b.largestDiameter());
            System.out.println(a.avgDepth());
            System.out.println(b.avgDepth());
            System.out.println(a.isSaltWater());
            System.out.println(b.isSaltWater());
    
            a.setName("Superior");
            System.out.println(a.name());
        }
    }
    

