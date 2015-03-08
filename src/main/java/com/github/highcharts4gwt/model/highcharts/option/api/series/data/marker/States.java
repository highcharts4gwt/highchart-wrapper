
package com.github.highcharts4gwt.model.highcharts.option.api.series.data.marker;

import com.github.highcharts4gwt.model.highcharts.option.api.series.data.marker.states.Hover;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.marker.states.Select;


/**
 * 
 */
public interface States {


    /**
     * 
     */
    Hover hover();

    /**
     * 
     */
    States hover(Hover hover);

    /**
     * The appearance of the point marker when selected. In order to allow a point to be 
     * 		selected, set the <code>series.allowPointSelect</code> option to true.
     * 
     */
    Select select();

    /**
     * The appearance of the point marker when selected. In order to allow a point to be 
     * 		selected, set the <code>series.allowPointSelect</code> option to true.
     * 
     */
    States select(Select select);

    String getFieldAsJsonObject(String fieldName);

    States setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
