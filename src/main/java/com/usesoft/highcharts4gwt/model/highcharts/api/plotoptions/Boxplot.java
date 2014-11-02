
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Column;

public interface Boxplot
    extends Column
{


    String fillColor();

    Boxplot fillColor(String fillColor);

    String medianColor();

    Boxplot medianColor(String medianColor);

    Number medianWidth();

    Boxplot medianWidth(Number medianWidth);

    String stemColor();

    Boxplot stemColor(String stemColor);

    String stemDashStyle();

    Boxplot stemDashStyle(String stemDashStyle);

    Number stemWidth();

    Boxplot stemWidth(Number stemWidth);

    String whiskerColor();

    Boxplot whiskerColor(String whiskerColor);

    Number whiskerLengthAsNumber();

    Boxplot whiskerLengthAsNumber(Number whiskerLengthAsNumber);

    String whiskerLengthAsString();

    Boxplot whiskerLengthAsString(String whiskerLengthAsString);

    Number whiskerWidth();

    Boxplot whiskerWidth(Number whiskerWidth);

}
