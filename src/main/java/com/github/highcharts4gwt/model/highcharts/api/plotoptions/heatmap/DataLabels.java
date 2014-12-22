
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.api.xaxis.Labels;

public interface DataLabels
    extends Labels
{


    String backgroundColor();

    DataLabels backgroundColor(String backgroundColor);

    String borderColor();

    DataLabels borderColor(String borderColor);

    double borderRadius();

    DataLabels borderRadius(double borderRadius);

    double borderWidth();

    DataLabels borderWidth(double borderWidth);

    String color();

    DataLabels color(String color);

    boolean crop();

    DataLabels crop(boolean crop);

    boolean defer();

    DataLabels defer(boolean defer);

    boolean inside();

    DataLabels inside(boolean inside);

    double padding();

    DataLabels padding(double padding);

    boolean shadowAsBoolean();

    DataLabels shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    DataLabels shadowAsJsonString(String shadowAsJsonString);

    String verticalAlign();

    DataLabels verticalAlign(String verticalAlign);

}
