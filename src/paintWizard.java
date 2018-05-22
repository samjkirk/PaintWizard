import java.util.ArrayList;

public class paintWizard {
    ArrayList<Paint> paintList = new ArrayList<>();
    private int tinsReq;
    private int tempSize;
    private int tempCoverage;
    private String cheapestTin;
    private String leastWastageTin;
    private double wastage;
    private double leastWaste = 1000000000;

    private double tempPrice;
    private double bestPrice = 1000000000.00;

    public void runWizard() {
        paintList.add(new Paint("CheapoMax", 10, 19.99, 20));
        paintList.add(new Paint("AverageJoes", 11, 17.99, 15));
        paintList.add(new Paint("DuluxourousPaints",20, 25.0, 10));

        Room testRoom = new Room(210);

        System.out.println("Room size: " + testRoom.getSize(testRoom) + "m2");

        for (Paint paint : paintList){
            tinsReq = 0;
            tempSize = testRoom.getSize(testRoom);
            tempCoverage = paint.findCoveragePerTin(paint);
            tempPrice = paint.getPrice(paint);

            while (tempSize>0){
                tempSize -= tempCoverage;
                ++tinsReq;
            }
            if (bestPrice>tempPrice*tinsReq){
                bestPrice = tempPrice;
                cheapestTin = paint.getName(paint);
            }

            wastage = paint.findCoveragePerTin(paint)*tinsReq-testRoom.getSize(testRoom);
            if (leastWaste>wastage){
                leastWaste = wastage;
                leastWastageTin = paint.getName(paint);
            }

        }
        returnCheapestTin();
        returnLeastWastage();
    }

    private void returnCheapestTin(){
        for (Paint paint : paintList){
            if (cheapestTin.equals(paint.getName(paint))){
                System.out.println(paint.getName(paint) + " is the cheapest paint for a room of that size. Costing a total of £" + bestPrice*tinsReq + ".");
            }
        }
    }


    private void returnLeastWastage(){
        for (Paint paint : paintList){
            if (leastWastageTin.equals(paint.getName(paint))){
                switch (paint.getName(paint)) {
                    case ("CheapoMax"):
                        leastWaste /= 10;
                        break;
                    case ("AverageJoes"):
                        leastWaste /= 11;
                        break;
                    case ("DuluxourousPaints"):
                        leastWaste /= 20;
                        break;
                }
                System.out.println(paint.getName(paint) + " wastes the least for a room of that size, " + "with " + Math.round(leastWaste * 100.0) / 100.0 + " litres wasted.");
            }
        }
    }

}



