
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Boxplot;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarShowHandler;

public interface Errorbar
    extends Boxplot
{


    void addErrorbarAfterAnimateHandler(ErrorbarAfterAnimateHandler errorbarAfterAnimateHandler);

    void addErrorbarCheckboxClickHandler(ErrorbarCheckboxClickHandler errorbarCheckboxClickHandler);

    void addErrorbarClickHandler(ErrorbarClickHandler errorbarClickHandler);

    void addErrorbarHideHandler(ErrorbarHideHandler errorbarHideHandler);

    void addErrorbarLegendItemClickHandler(ErrorbarLegendItemClickHandler errorbarLegendItemClickHandler);

    void addErrorbarMouseOutHandler(ErrorbarMouseOutHandler errorbarMouseOutHandler);

    void addErrorbarMouseOverHandler(ErrorbarMouseOverHandler errorbarMouseOverHandler);

    void addErrorbarShowHandler(ErrorbarShowHandler errorbarShowHandler);

}
