package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */

public abstract class Pet implements Animal {
    private String name;
    private Integer age;
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet() {
        this("", 0);
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this(name, 0);
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        // name is not set to empty string in test to use constructor calling
        this.age = age;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
//        newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return null;
    }
}
