package com.sda.she_likes_java.objects;

public class House {
    private int numberOfRoom;
    private int numberOfBathrooms;
    private int numberOfFloors;

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public House(int numberOfRoom, int numberOfBathrooms, int numberOfFloors) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public House(int numberOfRoom, int numberOfBathrooms) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRoom=" + numberOfRoom +
                ", numberOfBathrooms=" + numberOfBathrooms +
                '}';
    }


}
