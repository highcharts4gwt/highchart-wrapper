
package com.github.highcharts4gwt.model.highcharts.api;


public interface Tooltip {


    boolean animation();

    Tooltip animation(boolean animation);

    String backgroundColor();

    Tooltip backgroundColor(String backgroundColor);

    String borderColor();

    Tooltip borderColor(String borderColor);

    double borderRadius();

    Tooltip borderRadius(double borderRadius);

    double borderWidth();

    Tooltip borderWidth(double borderWidth);

    String dateTimeLabelFormats();

    Tooltip dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString);

    boolean enabled();

    Tooltip enabled(boolean enabled);

    boolean followPointer();

    Tooltip followPointer(boolean followPointer);

    boolean followTouchMove();

    Tooltip followTouchMove(boolean followTouchMove);

    String footerFormat();

    Tooltip footerFormat(String footerFormat);

    String headerFormat();

    Tooltip headerFormat(String headerFormat);

    double hideDelay();

    Tooltip hideDelay(double hideDelay);

    String pointFormat();

    Tooltip pointFormat(String pointFormat);

    boolean shadow();

    Tooltip shadow(boolean shadow);

    String shape();

    Tooltip shape(String shape);

    boolean shared();

    Tooltip shared(boolean shared);

    double snap();

    Tooltip snap(double snap);

    String style();

    Tooltip style(String styleAsJsonString);

    boolean useHTML();

    Tooltip useHTML(boolean useHTML);

    double valueDecimals();

    Tooltip valueDecimals(double valueDecimals);

    String valuePrefix();

    Tooltip valuePrefix(String valuePrefix);

    String valueSuffix();

    Tooltip valueSuffix(String valueSuffix);

    String xDateFormat();

    Tooltip xDateFormat(String xDateFormat);

}
