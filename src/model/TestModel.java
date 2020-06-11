package model;

public class TestModel implements Comparable<TestModel>{
    private String name;
    private String city;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int compareTo(TestModel o) {
        return this.name.compareTo(o.getName());
    }
}
