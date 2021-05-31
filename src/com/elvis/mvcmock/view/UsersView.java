package com.elvis.mvcmock.view;

import com.elvis.mvcmock.bean.User;
import com.elvis.mvcmock.controller.Controller;
import com.elvis.mvcmock.model.DataModel;

public class UsersView implements View {
    private Controller controller;

    @Override
    public void refresh(DataModel dataModel) {
        String title = dataModel.isDisplayDeletedUserList() ? "All deleted users:" : "All users:";
        System.out.println(title);
        for (User user : dataModel.getUsers()) {
            System.out.println("\t" + user);
        }
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireShowAllUsersEvent() {
        controller.onShowAllUsers();
    }

    public void fireShowDeletedUsersEvent() {
        controller.onShowAllDeletedUsers();
    }

    public void fireOpenUserEditFormEvent(long id) { controller.onOpenUserEditForm(id); }

}
