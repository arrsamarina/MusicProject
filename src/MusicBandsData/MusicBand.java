package MusicBandsData;

public class MusicBand {
    private long id;
    private String name;
    private int numberOfMusicians;
    private String frontman;
    private MusicType type;
    public MusicBand (long id, String name, int numberOfMusicians, String frontman, MusicType type){
        this.id = id;
        this.name = name;
        this.numberOfMusicians = numberOfMusicians;
        this.frontman = frontman;
        this.type = type;
    }
    public MusicBand(){}
    @Override
    public String toString() {
        return "MusicBandsData.MusicBand{" + "\n"+
                "id='" + id +"\n"+
                ", name=" + name + "\n"+
                ", numberOfMusicians=" + numberOfMusicians +"\n"+
                ", frontman=" + frontman +"\n"+
                ", type=" + type +"\n"+
                '}'+"\n";
    }

    public long getId() {
        return id;
    }

    public MusicBand setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public MusicBand setName(String name) {
        this.name = name;
        return this;
    }

    public int getNumberOfMusicians() {
        return numberOfMusicians;
    }

    public MusicBand setNumberOfMusicians(int numberOfMusicians) {
        this.numberOfMusicians = numberOfMusicians;
        return this;
    }

    public String getFrontman() {
        return frontman;
    }

    public MusicBand setFrontman(String frontman) {
        this.frontman = frontman;
        return this;
    }

    public MusicType getType() {
        return type;
    }

    public MusicBand setType(MusicType type) {
        this.type = type;
        return this;
    }

}
