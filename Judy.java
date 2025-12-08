public class Judy {
    private int health = 100;
    private int energy = 100;
    private int happiness = 100;

    // Setter methods to modify attributes
    public void setHealth(int health) {
        this.health = Math.max(0, Math.min(100, health));
    }

    public void setEnergy(int energy) {
        this.energy = Math.max(0, Math.min(100, energy));
    }

    public void setHappiness(int happiness) {
        this.happiness = Math.max(0, Math.min(100, happiness));
    }

    // Getter methods to retrieve attributes
    public int getHealth() {
        return this.health;
    }  

    public int getEnergy() {
        return this.energy;
    }

    public int getHappiness() {
        return this.happiness;
    }



    
}