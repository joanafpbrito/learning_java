package Ex_06;

public class Competition {
    private String name;
    private String origin;
    private Athlete[] list;

    public Competition(String name, String origin, int maxList) {
        this.name = name;
        this.origin = origin;
        this.list = maxList;
    }
}
