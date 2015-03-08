
package com.github.highcharts4gwt.model.highcharts.option.mock.exporting;

import com.github.highcharts4gwt.model.highcharts.option.api.exporting.Buttons;
import com.github.highcharts4gwt.model.highcharts.option.api.exporting.buttons.ContextButton;


/**
 * Options for the export related buttons, print and export. In addition to the default buttons listed here, custom buttons can be added. See <a href="#navigation.buttonOptions">navigation.buttonOptions</a> for general options.
 * 
 */
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
