package cl.uchile.dcc.cc5604.jstl.displaytag;

class City {

    private String name;
    private String region;
    private int people;

    public City(String name, String region, int people) {
        this.name = name;
        this.region = region;
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }
}
