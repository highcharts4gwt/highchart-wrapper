
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.marker;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.marker.states.Hover;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.marker.states.Select;

public interface States {


    Hover hover();

    States hover(Hover hover);

    Select select();

    States select(Select select);

}
