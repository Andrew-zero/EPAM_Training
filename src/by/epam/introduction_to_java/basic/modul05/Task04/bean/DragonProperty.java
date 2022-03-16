package by.epam.introduction_to_java.basic.modul05.Task04.bean;

import java.io.Serializable;
import java.util.Objects;

public class DragonProperty implements Serializable {

    private static final long serialVersionUID = 110L;

    private int age;
    private int power;
    private int lifeBar;
    private int sensitivity;

    public DragonProperty(){}

    public DragonProperty(int age, int power, int lifeBar, int sensitivity) {
        this.age = age;
        this.power = power;
        this.lifeBar = lifeBar;
        this.sensitivity = sensitivity;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setLifeBar(int lifeBar) {
        this.lifeBar = lifeBar;
    }

    public void setSensitivity(int sensitivity) {
        this.sensitivity = sensitivity;
    }

    public int getAge() {
        return age;
    }

    public int getPower() {
        return power;
    }

    public int getLifeBar() {
        return lifeBar;
    }

    public int getSensitivity() {
        return sensitivity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DragonProperty that = (DragonProperty) o;
        return age == that.age && power == that.power && lifeBar == that.lifeBar && sensitivity == that.sensitivity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, power, lifeBar, sensitivity);
    }

    @Override
    public String toString() {
        return "DragonProperty{" +
                "age=" + age +
                ", power=" + power +
                ", lifeBar=" + lifeBar +
                ", sensitivity=" + sensitivity +
                '}';
    }
}
