package com.early2home;

import java.util.List;

import lombok.Data;

@Data
public class ContentsList {
  List<Groups> groups;
  List<Contents> contents;
}
