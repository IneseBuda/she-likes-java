package com.sda.she_likes_java.final_project.repository;

import com.sda.she_likes_java.final_project.entity.User;

import java.util.Comparator;
import java.util.List;

public class UserRepository {

    public void registerNewUser(){

    }
    public void deleteUser(){

    }

    public List<Object> listAllUsers(){
        return List.of();
    }

    public void updateUser(User user){

    }
    //filtering
    public List<User>getUserBasedOnCriteria(){
        return List.of();
    }
    //order by age
    public List<User>getOrderedUsers(Comparator<User>comparator){
        return List.of();
    }
}
