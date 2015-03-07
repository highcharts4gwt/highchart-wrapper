
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.states.Hover;

public interface States {


    Hover hover();

    States hover(Hover hover);

    String getFieldAsJsonObject(String fieldName);

    States setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
