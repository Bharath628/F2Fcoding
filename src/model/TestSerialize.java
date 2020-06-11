package model;

import java.io.Serializable;

public class TestSerialize implements Serializable {

    private int len;
    private String name;

    public TestSerialize(int len, String name) {
        this.len = len;
        this.name = name;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestSerialize{" +
                "len=" + len +
                ", name='" + name + '\'' +
                '}';
    }
}
