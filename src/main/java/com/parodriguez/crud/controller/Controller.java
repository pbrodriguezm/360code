package com.parodriguez.crud.controller;

import java.util.List;

/**
 * Created by raul on 9/02/21.
 */
public interface Controller<DTO, KEY> {

  DTO create(DTO input);

  DTO get(KEY id);

  List<DTO> getAll();

  DTO update(DTO input, KEY id);

  void delete(KEY id);

}
