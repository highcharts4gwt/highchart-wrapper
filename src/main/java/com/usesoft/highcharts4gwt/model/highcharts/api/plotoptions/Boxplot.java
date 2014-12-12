
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Column;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotShowHandler;

public interface Boxplot
    extends Column
{


    void addBoxplotAfterAnimateHandler(BoxplotAfterAnimateHandler boxplotAfterAnimateHandler);

    void addBoxplotCheckboxClickHandler(BoxplotCheckboxClickHandler boxplotCheckboxClickHandler);

    void addBoxplotClickHandler(BoxplotClickHandler boxplotClickHandler);

    void addBoxplotHideHandler(BoxplotHideHandler boxplotHideHandler);

    void addBoxplotLegendItemClickHandler(BoxplotLegendItemClickHandler boxplotLegendItemClickHandler);

    void addBoxplotMouseOutHandler(BoxplotMouseOutHandler boxplotMouseOutHandler);

    void addBoxplotMouseOverHandler(BoxplotMouseOverHandler boxplotMouseOverHandler);

    void addBoxplotShowHandler(BoxplotShowHandler boxplotShowHandler);

    String fillColor();

    Boxplot fillColor(String fillColor);

    String medianColor();

    Boxplot medianColor(String medianColor);

    double medianWidth();

    Boxplot medianWidth(double medianWidth);

    String stemColor();

    Boxplot stemColor(String stemColor);

    String stemDashStyle();

    Boxplot stemDashStyle(String stemDashStyle);

    double stemWidth();

    Boxplot stemWidth(double stemWidth);

    String whiskerColor();

    Boxplot whiskerColor(String whiskerColor);

    double whiskerLengthAsNumber();

    Boxplot whiskerLengthAsNumber(double whiskerLengthAsNumber);

    String whiskerLengthAsString();

    Boxplot whiskerLengthAsString(String whiskerLengthAsString);

    double whiskerWidth();

    Boxplot whiskerWidth(double whiskerWidth);

}
