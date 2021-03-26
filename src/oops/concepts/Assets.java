package oops.concepts;

public class Assets {

    private int iChairs;
    private int iTables;
    private int iRacks;

    public void setChairs(int iChairs) {
        this.iChairs = iChairs;
    }

    public int getChairs() {
        return iChairs;
    }

    public void setTables(int iTables) {
        this.iTables = iTables;
    }

    public int getTables() {
        return iTables;
    }

    public void setRacks(int iRacks) {
        this.iRacks = iRacks;
    }

    public int getRacks() {
        return iRacks;
    }

       private String sMaterial;

        public void setsMaterial(String sMaterial) {
            this.sMaterial = sMaterial;
        }

        public String getsMaterial() {
            return sMaterial;
        }

    public Assets(){
    }

    public Assets(int iChairs,int iTables,int iRacks,String sMaterial){
            this.iChairs = iChairs;
            this.iTables=iTables;
            this.iRacks=iRacks;
            this.sMaterial=sMaterial;
    }
}
