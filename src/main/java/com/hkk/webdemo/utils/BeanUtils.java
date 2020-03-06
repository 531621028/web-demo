package com.hkk.webdemo.utils;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanUtils {

  public static final Logger LOG = LoggerFactory.getLogger(BeanUtils.class);

  private static final DozerBeanMapper mapper = new DozerBeanMapper();

  public static void copy(Object source, Object target) {
    mapper.map(source, target);
  }

  public static <T> T copy(Object source, Class<T> clazz) {
    return mapper.map(source, clazz);
  }
}
