
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Column;

public interface Boxplot
    extends Column
{


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
