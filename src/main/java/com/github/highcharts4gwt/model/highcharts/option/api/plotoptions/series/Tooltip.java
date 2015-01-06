
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series;


public interface Tooltip {


    String dateTimeLabelFormats();

    Tooltip dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString);

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

    String shape();

    Tooltip shape(String shape);

    double valueDecimals();

    Tooltip valueDecimals(double valueDecimals);

    String valuePrefix();

    Tooltip valuePrefix(String valuePrefix);

    String valueSuffix();

    Tooltip valueSuffix(String valueSuffix);

    String xDateFormat();

    Tooltip xDateFormat(String xDateFormat);

}
