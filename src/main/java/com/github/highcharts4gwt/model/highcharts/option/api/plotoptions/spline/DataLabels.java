
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;

public interface DataLabels {


    String align();

    DataLabels align(String align);

    boolean allowOverlap();

    DataLabels allowOverlap(boolean allowOverlap);

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

    boolean crop();

    DataLabels crop(boolean crop);

    boolean defer();

    DataLabels defer(boolean defer);

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
