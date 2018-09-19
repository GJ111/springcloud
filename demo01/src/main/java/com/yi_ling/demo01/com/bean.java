package com.yi_ling.demo01.com;

public class bean {
    public bean() {
    }

    public bean(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "bean{" +
                "name='" + name + '\'' +
                '}';
    }
}
