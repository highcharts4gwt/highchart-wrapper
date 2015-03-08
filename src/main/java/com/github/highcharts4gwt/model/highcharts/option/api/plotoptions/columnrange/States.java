
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.states.Hover;


/**
 * A wrapper object for all the series options in specific states.
 * 
 */
public interface States {


    /**
     * Options for the hovered series
     * 
     */
    Hover hover();

    /**
     * Options for the hovered series
     * 
     */
    States hover(Hover hover);

    String getFieldAsJsonObject(String fieldName);

    States setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
