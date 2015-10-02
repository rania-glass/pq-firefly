public class CrewMember {

    private String name;
    public int attackPower;
    public int defensePower;

    public CrewMember(String name, int attackPower, int defensePower) {
        this.name = name;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public String trainMore(int amtTraining) {
        attackPower = getAttackPower() + amtTraining;
    return name + "'s attack strength is now" + attackPower + ".";
    }

    public String defendMore(int amtDefense) {
        defensePower = getDefensePower() + amtDefense;
    return name + "'s  defense strength is now " + defensePower + ".";
    }

    public String toString() {
        return getName() + " has an attack strength of "
            + getAttackPower() + " and a defense strength of "
            + getDefensePower() + ".";
    }

}
