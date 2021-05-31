package com.elvis.mvcmock.model;

import com.elvis.mvcmock.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {
    private DataModel dataModel = new DataModel();

    @Override
    public DataModel getDataModel() {
        return dataModel;
    }

    @Override
    public void loadUsers() {
        User user1 = new User("A", 1, 1);
        User user2 = new User("B", 2, 1);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        dataModel.setUsers(users);
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }

}
