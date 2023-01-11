package com.early2home;

import java.util.List;

import lombok.Data;

@Data
public class TimeSeries {
  List<String> timeDefines;
  List<Areas> areas;
}
