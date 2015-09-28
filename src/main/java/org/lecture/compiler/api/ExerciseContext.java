package org.lecture.compiler.api;

/*
 * Copyright (c) 2015 Rene Richter.
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */

import java.util.Map;

/**
 * Resembles the contract between java-evaluation-service and custom unit tests.
 * @author Rene Richter
 */
public interface ExerciseContext {
  Object createObject(String className, Object... params);

  Object executeMethod(Object object, String methodName, Object... parameters);

  Map<String, Class<?>> getTestClasses();

  void setTestClasses(Map<String, Class<?>> classes);

  Map<String, Class<?>> getUserClasses();

  void setExerciseClasses(Map<String, Class<?>> exerciseClasses);
}
