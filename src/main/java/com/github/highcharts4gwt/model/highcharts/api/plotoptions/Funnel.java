
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Pie;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelShowHandler;

public interface Funnel
    extends Pie
{


    void addFunnelAfterAnimateHandler(FunnelAfterAnimateHandler funnelAfterAnimateHandler);

    void addFunnelCheckboxClickHandler(FunnelCheckboxClickHandler funnelCheckboxClickHandler);

    void addFunnelClickHandler(FunnelClickHandler funnelClickHandler);

    void addFunnelHideHandler(FunnelHideHandler funnelHideHandler);

    void addFunnelLegendItemClickHandler(FunnelLegendItemClickHandler funnelLegendItemClickHandler);

    void addFunnelMouseOutHandler(FunnelMouseOutHandler funnelMouseOutHandler);

    void addFunnelMouseOverHandler(FunnelMouseOverHandler funnelMouseOverHandler);

    void addFunnelShowHandler(FunnelShowHandler funnelShowHandler);

    double heightAsNumber();

    Funnel heightAsNumber(double heightAsNumber);

    String heightAsString();

    Funnel heightAsString(String heightAsString);

    double neckHeightAsNumber();

    Funnel neckHeightAsNumber(double neckHeightAsNumber);

    String neckHeightAsString();

    Funnel neckHeightAsString(String neckHeightAsString);

    double neckWidthAsNumber();

    Funnel neckWidthAsNumber(double neckWidthAsNumber);

    String neckWidthAsString();

    Funnel neckWidthAsString(String neckWidthAsString);

    boolean reversed();

    Funnel reversed(boolean reversed);

    double widthAsNumber();

    Funnel widthAsNumber(double widthAsNumber);

    String widthAsString();

    Funnel widthAsString(String widthAsString);

}
