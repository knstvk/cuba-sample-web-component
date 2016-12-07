/*
 * TODO Copyright
 */

package com.company.sample.web.components;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.web.gui.components.WebPickerField;

public class MyWebPickerField extends WebPickerField {

    @Override
    public LookupAction addLookupAction() {
        LookupAction action = new LookupAction(this);
        action.setLookupScreenOpenType(WindowManager.OpenType.DIALOG);
        addAction(action);
        return action;
    }
}
