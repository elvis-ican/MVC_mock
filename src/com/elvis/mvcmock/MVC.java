package com.elvis.mvcmock;

import com.elvis.mvcmock.controller.Controller;
import com.elvis.mvcmock.model.FakeModel;
import com.elvis.mvcmock.model.MainModel;
import com.elvis.mvcmock.model.Model;
import com.elvis.mvcmock.view.EditUserView;
import com.elvis.mvcmock.view.UsersView;

public class MVC {

    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        controller.setModel(model);
        usersView.setController(controller);
        editUserView.setController(controller);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireShowAllUsersEvent();
        usersView.fireOpenUserEditFormEvent(126L);
        editUserView.fireUserDeletedEvent(124L);
        editUserView.fireUserDataChangedEvent("Elvis", 126, 88);
        usersView.fireShowDeletedUsersEvent();

    }
}