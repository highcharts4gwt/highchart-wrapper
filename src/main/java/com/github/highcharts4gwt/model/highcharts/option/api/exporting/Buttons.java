
package com.github.highcharts4gwt.model.highcharts.option.api.exporting;

import com.github.highcharts4gwt.model.highcharts.option.api.exporting.buttons.ContextButton;


/**
 * Options for the export related buttons, print and export. In addition to the default buttons listed here, custom buttons can be added. See <a href="#navigation.buttonOptions">navigation.buttonOptions</a> for general options.
 * 
 */
public interface Buttons {


    /**
     * Options for the export button.
     * 
     */
    ContextButton contextButton();

    /**
     * Options for the export button.
     * 
     */
    Buttons contextButton(ContextButton contextButton);

    String getFieldAsJsonObject(String fieldName);

    Buttons setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Buttons setFunctionAsString(String fieldName, String functionAsString);

}
