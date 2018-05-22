public class Paint {
    private String name;
    private int coveragePerLitre;
    private double pricePerTin;
    private int sizeInLitre;

    private void setName(String name){ this.name = name; }
    private void setCoverage(int x){ this.coveragePerLitre = x; }
    private void setPrice(double y) { this.pricePerTin= y; }
    private void setSize(int z) { this.sizeInLitre= z; }

    public String getName(Paint paint){ return paint.name; }
    public int getCoverage(Paint paint){ return paint.coveragePerLitre; }
    public double getPrice(Paint paint){ return paint.pricePerTin; }
    public int getSize(Paint paint){ return paint.sizeInLitre; }


    public Paint(String name, int coverage, double price, int size) {
        setName(name);
        setCoverage(coverage);
        setPrice(price);
        setSize(size);
    }

    public int findCoveragePerTin(Paint paint){
        return paint.getCoverage(paint)*paint.getSize(paint);
    }
}
