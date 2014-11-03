
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Pie;

public interface Funnel
    extends Pie
{


    double heightAsNumber();

    Funnel heightAsNumber(double heightAsNumber);

    String heightAsString();

    Funnel heightAsString(String heightAsString);

    double neckHeightAsNumber();

    Funnel neckHeightAsNumber(double neckHeightAsNumber);

    String neckHeightAsString();

    Funnel neckHeightAsString(String neckHeightAsString);

    double neckWidthAsNumber();

    Funnel neckWidthAsNumber(double neckWidthAsNumber);

    String neckWidthAsString();

    Funnel neckWidthAsString(String neckWidthAsString);

    boolean reversed();

    Funnel reversed(boolean reversed);

    double widthAsNumber();

    Funnel widthAsNumber(double widthAsNumber);

    String widthAsString();

    Funnel widthAsString(String widthAsString);

}
