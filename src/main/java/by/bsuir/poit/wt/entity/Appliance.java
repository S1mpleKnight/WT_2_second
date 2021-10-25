package by.bsuir.poit.wt.entity;

import java.util.List;

public class Appliance {
    List<String> applianceList;

    @Override
    public String toString() {
        return "Appliance: " + applianceList;
    }

    public Appliance(List<String> test){
        this.applianceList = test;
    }
}