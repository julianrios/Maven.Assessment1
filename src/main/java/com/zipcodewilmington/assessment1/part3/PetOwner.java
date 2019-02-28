package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private String name;
    private Pet[] pets;
//    private List<Pet> pets = new ArrayList<>();
    public PetOwner(String name, Pet... pets) {
//        this.name = name;
//        if(pets != null) {
//            // Returns a fixed-size list backed by the specified array.
//            this.pets = new ArrayList<>(Arrays.asList(pets));
//            for(Pet pet : pets) {
//                pet.setOwner(this);
//            }
//        }
        this.name = name;
        if (pets == null) {
            this.pets = new Pet[0];
        } else {
            this.pets = pets;
            setOwner(pets);
        }
    }

    private void setOwner(Pet[] pets) {
        for(Pet currentPet : pets) {
            currentPet.setOwner(this);
        }
    }


    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
//        Pet[] newPets = Arrays.copyOf(this.pets, this.pets.length + 1);
//        newPets[newPets.length - 1] = pet;
//        pet.setOwner(this);
//        this.pets = newPets;

        Pet[] newPets = Arrays.copyOf(this.pets, this.pets.length + 1);
        newPets[newPets.length - 1] = pet;
        pet.setOwner(this);
        this.pets = newPets;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
//        this.pets.remove(pet);
        // removing one pet
//        Pet[] newPets = Arrays.copyOf(pets, pets.length-1);
//        int newPetIndex = 0;
//        for(Pet currentPet : pets) {
//            if(!currentPet.equals(pet)) {
//                newPets[newPetIndex] = currentPet;
//                newPetIndex++;
//            }
//        }
//        return this.pets = newPets;

        for(int i = 0; i < pets.length; i++) {
            if(pets[i].equals(pet)) {
                pets[i] = null;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        //return pets.contains(pet);
        return this.equals(pet.getOwner());
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
//        Collections.sort(pets);
//        return pets.get(0).getAge();

        Pet youngest = this.pets[0];

        for(Pet currentPet : pets) {
            if (currentPet.getAge() < youngest.getAge()) {
                youngest = currentPet;
            }
        }
        return youngest.getAge();
    }



    @SuppressWarnings("getOldestPetAge")
    /**
     *
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Pet oldest = this.pets[0];

        for(Pet currentPet : pets) {
            if (currentPet.getAge() > oldest.getAge()) {
                oldest = currentPet;
            }
        }
        return oldest.getAge();
        // return pets.get(pets.size()-1).getAge();
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float total = 0;

        for(Pet currentPet : pets) {
            total += currentPet.getAge();
        }
        return total/pets.length;
//        Integer average = pets.size();
//        Float sum = 0.0f;
//        for(Pet pet : pets) {
//            sum += pet.getAge();
//        }
//        sum /= average;
//        return sum;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
//        return pets.size();
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
