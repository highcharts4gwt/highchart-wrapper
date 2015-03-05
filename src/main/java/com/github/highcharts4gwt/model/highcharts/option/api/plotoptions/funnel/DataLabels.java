
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;

public interface DataLabels {


    ArrayNumber autoRotation();

    DataLabels autoRotation(ArrayNumber autoRotation);

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

    String connectorColor();

    DataLabels connectorColor(String connectorColor);

    double connectorPadding();

    DataLabels connectorPadding(double connectorPadding);

    double connectorWidth();

    DataLabels connectorWidth(double connectorWidth);

    boolean crop();

    DataLabels crop(boolean crop);

    boolean defer();

    DataLabels defer(boolean defer);

    double distance();

    DataLabels distance(double distance);

    boolean enabled();

    DataLabels enabled(boolean enabled);

    String format();

    DataLabels format(String format);

    boolean inside();

    DataLabels inside(boolean inside);

    String overflow();

    DataLabels overflow(String overflow);

    double padding();

    DataLabels padding(double padding);

    double rotation();

    DataLabels rotation(double rotation);

    boolean shadowAsBoolean();

    DataLabels shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    DataLabels shadowAsJsonString(String shadowAsJsonString);

    String shape();

    DataLabels shape(String shape);

    boolean softConnector();

    DataLabels softConnector(boolean softConnector);

    String style();

    DataLabels style(String styleAsJsonString);

    boolean useHTML();

    DataLabels useHTML(boolean useHTML);

    String verticalAlign();

    DataLabels verticalAlign(String verticalAlign);

    double x();

    DataLabels x(double x);

    double y();

    DataLabels y(double y);

    double zIndex();

    DataLabels zIndex(double zIndex);

}
