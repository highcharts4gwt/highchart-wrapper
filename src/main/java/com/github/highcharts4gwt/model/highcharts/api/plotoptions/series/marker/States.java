
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.marker;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.marker.states.Hover;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.marker.states.Select;

public interface States {


    Hover hover();

    States hover(Hover hover);

    Select select();

    States select(Select select);

}
