
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble;

import com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.Labels;

public interface DataLabels
    extends Labels
{


    String backgroundColor();

    DataLabels backgroundColor(String backgroundColor);

    String borderColor();

    DataLabels borderColor(String borderColor);

    Number borderRadius();

    DataLabels borderRadius(Number borderRadius);

    Number borderWidth();

    DataLabels borderWidth(Number borderWidth);

    String color();

    DataLabels color(String color);

    boolean crop();

    DataLabels crop(boolean crop);

    boolean defer();

    DataLabels defer(boolean defer);

    boolean inside();

    DataLabels inside(boolean inside);

    Number padding();

    DataLabels padding(Number padding);

    boolean shadowAsBoolean();

    DataLabels shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    DataLabels shadowAsJsonString(String shadowAsJsonString);

    String verticalAlign();

    DataLabels verticalAlign(String verticalAlign);

}
