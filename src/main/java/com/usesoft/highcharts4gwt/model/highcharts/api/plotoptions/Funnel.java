
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Pie;

public interface Funnel
    extends Pie
{


    Number heightAsNumber();

    Funnel heightAsNumber(Number heightAsNumber);

    String heightAsString();

    Funnel heightAsString(String heightAsString);

    Number neckHeightAsNumber();

    Funnel neckHeightAsNumber(Number neckHeightAsNumber);

    String neckHeightAsString();

    Funnel neckHeightAsString(String neckHeightAsString);

    Number neckWidthAsNumber();

    Funnel neckWidthAsNumber(Number neckWidthAsNumber);

    String neckWidthAsString();

    Funnel neckWidthAsString(String neckWidthAsString);

    boolean reversed();

    Funnel reversed(boolean reversed);

    Number widthAsNumber();

    Funnel widthAsNumber(Number widthAsNumber);

    String widthAsString();

    Funnel widthAsString(String widthAsString);

}
