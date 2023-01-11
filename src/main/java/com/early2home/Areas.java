package com.early2home;

import java.util.List;

import lombok.Data;

@Data
public class Areas {
  Area area;
  List<String> weatherCodes;
  List<String> weathers;
  List<String> winds;
  List<String> waves;
}
