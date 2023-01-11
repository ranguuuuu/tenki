package com.early2home;

import java.util.ArrayList;

import lombok.Data;

@Data
public class AmedasSelectors {
  String key;
  ArrayList<Values> values = new ArrayList<>();
}
