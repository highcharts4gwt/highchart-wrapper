
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.states.Hover;

public interface States {


    Hover hover();

    States hover(Hover hover);

    String getFieldAsJsonObject(String fieldName);

    States setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
