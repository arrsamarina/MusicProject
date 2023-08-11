package Collection;

import MusicBandsData.MusicBand;
import MusicBandsData.MusicType;

import java.util.HashMap;

public class CollectionWork {
    public static HashMap<Integer, MusicBand> mbCollection = new HashMap<>();
    public static void setCollection() {
        MusicBand slipknot = new MusicBand(11111, "Slipknotttt", 9, "Corey_Taylor", MusicType.HEAVYMETAL);
        MusicBand theNeighbourhood = new MusicBand(11112, "The_Neighbourhood", 5, "Jesse_Rutherford", MusicType.ALTERNATIVEROCK);
        MusicBand accidentalDeathBenefit = new MusicBand(11113, "Accidental_Death_Benefit", 5, "Black_Iceberg", MusicType.DEATHMETAL);
        MusicBand theHatters = new MusicBand(11114, "The_Hatters", 5, "Yra_Muzichenko", MusicType.ALCOHARDCORE);
        MusicBand twentyOnePilots = new MusicBand(1115, "Twenty_One_Pilots", 2, "Tyler_Joseph", MusicType.ALTERNATIVEROCK);
        mbCollection.put(111, slipknot);
        mbCollection.put(112, theNeighbourhood);
        mbCollection.put(113, accidentalDeathBenefit);
        mbCollection.put(114, theHatters);
        mbCollection.put(115, twentyOnePilots);
    }

}
