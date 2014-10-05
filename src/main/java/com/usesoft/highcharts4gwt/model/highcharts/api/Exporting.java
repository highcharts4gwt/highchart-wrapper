
package com.usesoft.highcharts4gwt.model.highcharts.api;

import com.usesoft.highcharts4gwt.model.highcharts.api.exporting.Buttons;

public interface Exporting {


    Buttons buttons();

    Exporting buttons(Buttons buttons);

    String chartOptions();

    Exporting chartOptions(String chartOptions);

    boolean enabled();

    Exporting enabled(boolean enabled);

    String filename();

    Exporting filename(String filename);

    String formAttributes();

    Exporting formAttributes(String formAttributes);

    Number scale();

    Exporting scale(Number scale);

    Number sourceHeight();

    Exporting sourceHeight(Number sourceHeight);

    Number sourceWidth();

    Exporting sourceWidth(Number sourceWidth);

    String type();

    Exporting type(String type);

    String url();

    Exporting url(String url);

    Number width();

    Exporting width(Number width);

}
