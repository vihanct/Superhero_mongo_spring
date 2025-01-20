package com.example.SuperHero.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//@Data
//@Document(collection = "superheroes") //mongo collection name
//public class SuperHero {
//
//    @Id
//    private String id;
//    private String name;
//    private String power;
//    private String universe;
//}
//
@Document(collection = "superheroes") //mongo collection name
public class SuperHero {
    @Id
    private String id;
    private String name;
    private String Power;
    private String gender;
    private String Universe;
    private String villain;

    public SuperHero() {
    }

    public String getName() {
        return this.name;
    }

    public String getPower() {
        return this.Power;
    }

    public String getGender() {
        return this.gender;
    }

    public String getUniverse() {
        return this.Universe;
    }

    public String getVillain() {
        return this.villain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(String Power) {
        this.Power = Power;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setUniverse(String Universe) {
        this.Universe = Universe;
    }

    public void setVillain(String villain) {
        this.villain = villain;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SuperHero)) return false;
        final SuperHero other = (SuperHero) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$Power = this.getPower();
        final Object other$Power = other.getPower();
        if (this$Power == null ? other$Power != null : !this$Power.equals(other$Power)) return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false;
        final Object this$Universe = this.getUniverse();
        final Object other$Universe = other.getUniverse();
        if (this$Universe == null ? other$Universe != null : !this$Universe.equals(other$Universe)) return false;
        final Object this$villain = this.getVillain();
        final Object other$villain = other.getVillain();
        if (this$villain == null ? other$villain != null : !this$villain.equals(other$villain)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SuperHero;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $Power = this.getPower();
        result = result * PRIME + ($Power == null ? 43 : $Power.hashCode());
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        final Object $Universe = this.getUniverse();
        result = result * PRIME + ($Universe == null ? 43 : $Universe.hashCode());
        final Object $villain = this.getVillain();
        result = result * PRIME + ($villain == null ? 43 : $villain.hashCode());
        return result;
    }

    public String toString() {
        return "SuperHero(name=" + this.getName() + ", Power=" + this.getPower() + ", gender=" + this.getGender() + ", Universe=" + this.getUniverse() + ", villain=" + this.getVillain() + ")";
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
