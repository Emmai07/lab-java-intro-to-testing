public class Warrior extends Player {

    private int force;
    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        this.force=force;
    }

    // Additional methods specific to Warrior can be added here
    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
    public Elf convertToElf() {
        return new Elf(this.getHealth(), this.getStrength(), this.getLives(), this.force);
    }
}
