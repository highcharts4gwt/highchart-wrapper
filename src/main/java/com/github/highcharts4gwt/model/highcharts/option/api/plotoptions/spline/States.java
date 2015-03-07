
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.states.Hover;

public interface States {


    Hover hover();

    States hover(Hover hover);

    String getFieldAsJsonObject(String fieldName);

    States setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
