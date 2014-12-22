
package com.github.highcharts4gwt.model.highcharts.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.api.XAxis;
import com.github.highcharts4gwt.model.highcharts.api.xaxis.Labels;
import com.github.highcharts4gwt.model.highcharts.api.xaxis.PlotBand;
import com.github.highcharts4gwt.model.highcharts.api.xaxis.PlotLine;
import com.github.highcharts4gwt.model.highcharts.api.xaxis.Title;
import com.github.highcharts4gwt.model.highcharts.api.xaxis.XAxisAfterSetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.api.xaxis.XAxisSetExtremesHandler;

public class MockXAxis
    implements XAxis
{

    private boolean allowDecimals;
    private String alternateGridColor;
    private ArrayString categories;
    private double ceiling;
    private String dateTimeLabelFormats;
    private boolean endOnTick;
    private double floor;
    private String gridLineColor;
    private String gridLineDashStyle;
    private double gridLineWidth;
    private double gridZIndex;
    private String id;
    private Labels labels;
    private String lineColor;
    private double lineWidth;
    private double linkedTo;
    private double max;
    private double maxPadding;
    private double maxZoom;
    private double min;
    private double minPadding;
    private double minRange;
    private double minTickInterval;
    private String minorGridLineColor;
    private String minorGridLineDashStyle;
    private double minorGridLineWidth;
    private String minorTickColor;
    private String minorTickIntervalAsString;
    private double minorTickIntervalAsNumber;
    private double minorTickLength;
    private String minorTickPosition;
    private double minorTickWidth;
    private double offset;
    private boolean opposite;
    private Array<PlotBand> plotBands;
    private Array<PlotLine> plotLines;
    private boolean reversed;
    private boolean showEmpty;
    private boolean showFirstLabel;
    private boolean showLastLabel;
    private double startOfWeek;
    private boolean startOnTick;
    private String tickColor;
    private double tickInterval;
    private double tickLength;
    private double tickPixelInterval;
    private String tickPosition;
    private ArrayNumber tickPositions;
    private double tickWidth;
    private String tickmarkPlacement;
    private Title title;
    private String type;
    private ArrayNumber units;

    public boolean allowDecimals() {
        return allowDecimals;
    }

    public MockXAxis allowDecimals(boolean allowDecimals) {
        this.allowDecimals = allowDecimals;
        return this;
    }

    public String alternateGridColor() {
        return alternateGridColor;
    }

    public MockXAxis alternateGridColor(String alternateGridColor) {
        this.alternateGridColor = alternateGridColor;
        return this;
    }

    public ArrayString categories() {
        return categories;
    }

    public MockXAxis categories(ArrayString categories) {
        this.categories = categories;
        return this;
    }

    public double ceiling() {
        return ceiling;
    }

    public MockXAxis ceiling(double ceiling) {
        this.ceiling = ceiling;
        return this;
    }

    public String dateTimeLabelFormats() {
        return dateTimeLabelFormats;
    }

    public MockXAxis dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString) {
        this.dateTimeLabelFormats = dateTimeLabelFormatsAsJsonString;
        return this;
    }

    public boolean endOnTick() {
        return endOnTick;
    }

    public MockXAxis endOnTick(boolean endOnTick) {
        this.endOnTick = endOnTick;
        return this;
    }

    public void addXAxisAfterSetExtremesHandler(XAxisAfterSetExtremesHandler handler) {
    }

    public void addXAxisSetExtremesHandler(XAxisSetExtremesHandler handler) {
    }

    public double floor() {
        return floor;
    }

    public MockXAxis floor(double floor) {
        this.floor = floor;
        return this;
    }

    public String gridLineColor() {
        return gridLineColor;
    }

    public MockXAxis gridLineColor(String gridLineColor) {
        this.gridLineColor = gridLineColor;
        return this;
    }

    public String gridLineDashStyle() {
        return gridLineDashStyle;
    }

    public MockXAxis gridLineDashStyle(String gridLineDashStyle) {
        this.gridLineDashStyle = gridLineDashStyle;
        return this;
    }

    public double gridLineWidth() {
        return gridLineWidth;
    }

    public MockXAxis gridLineWidth(double gridLineWidth) {
        this.gridLineWidth = gridLineWidth;
        return this;
    }

    public double gridZIndex() {
        return gridZIndex;
    }

    public MockXAxis gridZIndex(double gridZIndex) {
        this.gridZIndex = gridZIndex;
        return this;
    }

    public String id() {
        return id;
    }

    public MockXAxis id(String id) {
        this.id = id;
        return this;
    }

    public Labels labels() {
        return labels;
    }

    public MockXAxis labels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockXAxis lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockXAxis lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public double linkedTo() {
        return linkedTo;
    }

    public MockXAxis linkedTo(double linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public double max() {
        return max;
    }

    public MockXAxis max(double max) {
        this.max = max;
        return this;
    }

    public double maxPadding() {
        return maxPadding;
    }

    public MockXAxis maxPadding(double maxPadding) {
        this.maxPadding = maxPadding;
        return this;
    }

    public double maxZoom() {
        return maxZoom;
    }

    public MockXAxis maxZoom(double maxZoom) {
        this.maxZoom = maxZoom;
        return this;
    }

    public double min() {
        return min;
    }

    public MockXAxis min(double min) {
        this.min = min;
        return this;
    }

    public double minPadding() {
        return minPadding;
    }

    public MockXAxis minPadding(double minPadding) {
        this.minPadding = minPadding;
        return this;
    }

    public double minRange() {
        return minRange;
    }

    public MockXAxis minRange(double minRange) {
        this.minRange = minRange;
        return this;
    }

    public double minTickInterval() {
        return minTickInterval;
    }

    public MockXAxis minTickInterval(double minTickInterval) {
        this.minTickInterval = minTickInterval;
        return this;
    }

    public String minorGridLineColor() {
        return minorGridLineColor;
    }

    public MockXAxis minorGridLineColor(String minorGridLineColor) {
        this.minorGridLineColor = minorGridLineColor;
        return this;
    }

    public String minorGridLineDashStyle() {
        return minorGridLineDashStyle;
    }

    public MockXAxis minorGridLineDashStyle(String minorGridLineDashStyle) {
        this.minorGridLineDashStyle = minorGridLineDashStyle;
        return this;
    }

    public double minorGridLineWidth() {
        return minorGridLineWidth;
    }

    public MockXAxis minorGridLineWidth(double minorGridLineWidth) {
        this.minorGridLineWidth = minorGridLineWidth;
        return this;
    }

    public String minorTickColor() {
        return minorTickColor;
    }

    public MockXAxis minorTickColor(String minorTickColor) {
        this.minorTickColor = minorTickColor;
        return this;
    }

    public String minorTickIntervalAsString() {
        return minorTickIntervalAsString;
    }

    public MockXAxis minorTickIntervalAsString(String minorTickIntervalAsString) {
        this.minorTickIntervalAsString = minorTickIntervalAsString;
        return this;
    }

    public double minorTickIntervalAsNumber() {
        return minorTickIntervalAsNumber;
    }

    public MockXAxis minorTickIntervalAsNumber(double minorTickIntervalAsNumber) {
        this.minorTickIntervalAsNumber = minorTickIntervalAsNumber;
        return this;
    }

    public double minorTickLength() {
        return minorTickLength;
    }

    public MockXAxis minorTickLength(double minorTickLength) {
        this.minorTickLength = minorTickLength;
        return this;
    }

    public String minorTickPosition() {
        return minorTickPosition;
    }

    public MockXAxis minorTickPosition(String minorTickPosition) {
        this.minorTickPosition = minorTickPosition;
        return this;
    }

    public double minorTickWidth() {
        return minorTickWidth;
    }

    public MockXAxis minorTickWidth(double minorTickWidth) {
        this.minorTickWidth = minorTickWidth;
        return this;
    }

    public double offset() {
        return offset;
    }

    public MockXAxis offset(double offset) {
        this.offset = offset;
        return this;
    }

    public boolean opposite() {
        return opposite;
    }

    public MockXAxis opposite(boolean opposite) {
        this.opposite = opposite;
        return this;
    }

    public Array<PlotBand> plotBands() {
        return plotBands;
    }

    public MockXAxis plotBands(Array<PlotBand> plotBands) {
        this.plotBands = plotBands;
        return this;
    }

    public Array<PlotLine> plotLines() {
        return plotLines;
    }

    public MockXAxis plotLines(Array<PlotLine> plotLines) {
        this.plotLines = plotLines;
        return this;
    }

    public boolean reversed() {
        return reversed;
    }

    public MockXAxis reversed(boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public boolean showEmpty() {
        return showEmpty;
    }

    public MockXAxis showEmpty(boolean showEmpty) {
        this.showEmpty = showEmpty;
        return this;
    }

    public boolean showFirstLabel() {
        return showFirstLabel;
    }

    public MockXAxis showFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    public boolean showLastLabel() {
        return showLastLabel;
    }

    public MockXAxis showLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
        return this;
    }

    public double startOfWeek() {
        return startOfWeek;
    }

    public MockXAxis startOfWeek(double startOfWeek) {
        this.startOfWeek = startOfWeek;
        return this;
    }

    public boolean startOnTick() {
        return startOnTick;
    }

    public MockXAxis startOnTick(boolean startOnTick) {
        this.startOnTick = startOnTick;
        return this;
    }

    public String tickColor() {
        return tickColor;
    }

    public MockXAxis tickColor(String tickColor) {
        this.tickColor = tickColor;
        return this;
    }

    public double tickInterval() {
        return tickInterval;
    }

    public MockXAxis tickInterval(double tickInterval) {
        this.tickInterval = tickInterval;
        return this;
    }

    public double tickLength() {
        return tickLength;
    }

    public MockXAxis tickLength(double tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    public double tickPixelInterval() {
        return tickPixelInterval;
    }

    public MockXAxis tickPixelInterval(double tickPixelInterval) {
        this.tickPixelInterval = tickPixelInterval;
        return this;
    }

    public String tickPosition() {
        return tickPosition;
    }

    public MockXAxis tickPosition(String tickPosition) {
        this.tickPosition = tickPosition;
        return this;
    }

    public ArrayNumber tickPositions() {
        return tickPositions;
    }

    public MockXAxis tickPositions(ArrayNumber tickPositions) {
        this.tickPositions = tickPositions;
        return this;
    }

    public double tickWidth() {
        return tickWidth;
    }

    public MockXAxis tickWidth(double tickWidth) {
        this.tickWidth = tickWidth;
        return this;
    }

    public String tickmarkPlacement() {
        return tickmarkPlacement;
    }

    public MockXAxis tickmarkPlacement(String tickmarkPlacement) {
        this.tickmarkPlacement = tickmarkPlacement;
        return this;
    }

    public Title title() {
        return title;
    }

    public MockXAxis title(Title title) {
        this.title = title;
        return this;
    }

    public String type() {
        return type;
    }

    public MockXAxis type(String type) {
        this.type = type;
        return this;
    }

    public ArrayNumber units() {
        return units;
    }

    public MockXAxis units(ArrayNumber units) {
        this.units = units;
        return this;
    }

}
