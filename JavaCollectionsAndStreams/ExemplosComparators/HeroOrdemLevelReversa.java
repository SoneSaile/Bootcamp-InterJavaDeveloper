package JavaCollectionsAndStreams.ExemplosComparators;

import java.util.Comparator;

public class HeroOrdemLevelReversa implements Comparator<Hero> {

    @Override
    public int compare(Hero o1, Hero o2) {
        return o1.getLevel() - o2.getLevel();
    }
}
