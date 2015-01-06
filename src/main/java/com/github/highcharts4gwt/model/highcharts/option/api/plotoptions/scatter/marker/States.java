
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.marker;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.marker.states.Hover;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.marker.states.Select;

public interface States {


    Hover hover();

    States hover(Hover hover);

    Select select();

    States select(Select select);

}
