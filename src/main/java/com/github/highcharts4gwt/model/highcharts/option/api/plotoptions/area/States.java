
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.states.Hover;

public interface States {


    Hover hover();

    States hover(Hover hover);

    String getFieldAsJsonObject(String fieldName);

    States setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
