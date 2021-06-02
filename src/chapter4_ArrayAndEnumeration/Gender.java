package chapter4_ArrayAndEnumeration;

public enum Gender {
    male("m", 1), female("fm", 2);
    private String mgd;
    private int mnumgd;
    private Gender(String gd, int numgd){
        mgd = gd;
        mnumgd = numgd;
    }
    public String getgd(){
        return mgd;
    }
    public int getNumgd(){
        return mnumgd;
    }
}
