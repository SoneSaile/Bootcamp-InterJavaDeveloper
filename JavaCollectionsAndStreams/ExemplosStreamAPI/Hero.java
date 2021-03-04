package JavaCollectionsAndStreams.ExemplosStreamAPI;

public class Hero implements Comparable<Hero>{

    private String name;
    private String attribute;
    private Integer level;

    public Hero(String name, String attribute, Integer level) {
        this.name = name;
        this.attribute = attribute;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getAttribute() {
        return attribute;
    }

    public Integer getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return name + "-" + attribute + " Level: " + level;
    }
    @Override
    public int compareTo(Hero o) {
        return this.getLevel() - o.getLevel();
    }
}
