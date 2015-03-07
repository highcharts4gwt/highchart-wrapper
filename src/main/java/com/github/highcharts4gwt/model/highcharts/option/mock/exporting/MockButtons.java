
package com.github.highcharts4gwt.model.highcharts.option.mock.exporting;

import com.github.highcharts4gwt.model.highcharts.option.api.exporting.Buttons;
import com.github.highcharts4gwt.model.highcharts.option.api.exporting.buttons.ContextButton;

public class MockButtons
    implements Buttons
{

    private ContextButton contextButton;
    private String genericField;

    public ContextButton contextButton() {
        return contextButton;
    }

    public MockButtons contextButton(ContextButton contextButton) {
        this.contextButton = contextButton;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockButtons setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
