
package com.github.highcharts4gwt.model.highcharts.option.api.exporting;

import com.github.highcharts4gwt.model.highcharts.option.api.exporting.buttons.ContextButton;

public interface Buttons {


    ContextButton contextButton();

    Buttons contextButton(ContextButton contextButton);

    String getFieldAsJsonObject(String fieldName);

    Buttons setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
