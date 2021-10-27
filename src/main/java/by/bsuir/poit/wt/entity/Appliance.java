package by.bsuir.poit.wt.entity;

import java.util.List;

/**
 * Supper class for all appliances
 */
public class Appliance {
    /**
     * Search results objects
     */
    List<String> applianceList;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Appliance:\n");
        for (String appliance : applianceList) {
            sb.append("\t").append(appliance).append(";\n");
        }
        return sb.toString();
    }

    /**
     * Constructor for the appliance
     *
     * @param result  list of appliances string representations
     */
    public Appliance(List<String> result){
        this.applianceList = result;
    }
}