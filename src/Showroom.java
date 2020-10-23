/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mkonda
 */
public class Showroom {

    private int id = 0;
    private String manager = null;
    private String location = null;
    private String[] cars = new String[]{};
    private String[] bikes = new String[]{};

    public Showroom(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String[] getCars() {
        return cars;
    }
    public String[] getBikes() {
        return bikes;
    }

    public void setCars(String[] cars) {
        this.cars = cars;
    }
    public void setBikes(String[] bikes) {
        this.bikes = bikes;
    }
}

