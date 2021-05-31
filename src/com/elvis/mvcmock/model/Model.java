package com.elvis.mvcmock.model;

public interface Model {

    DataModel getDataModel();

    void loadUsers();

    void loadDeletedUsers();

    void loadUserById(long userId);

    void deleteUserById(long id);

   void changeUserData(String name, long id, int level);

}
