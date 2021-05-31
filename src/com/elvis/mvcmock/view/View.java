package com.elvis.mvcmock.view;

import com.elvis.mvcmock.controller.Controller;
import com.elvis.mvcmock.model.DataModel;

public interface View {
    void refresh(DataModel dataModel);

    void setController(Controller controller);
}
