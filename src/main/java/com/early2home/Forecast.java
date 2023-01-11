package com.early2home;

import java.util.List;

import lombok.Data;

@Data
public class Forecast {
  String publishingOffice;
  String reportDatetime;
  List<TimeSeries> timeSeries;
}
