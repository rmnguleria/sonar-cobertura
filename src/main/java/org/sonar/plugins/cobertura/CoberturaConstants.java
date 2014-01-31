/*
 * SonarQube Cobertura Plugin
 * Copyright (C) 2013 SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.cobertura;

import org.sonar.api.batch.maven.MavenUtils;

public final class CoberturaConstants {

  public static final String COBERTURA_REPORT_PATH_PROPERTY = "sonar.cobertura.reportPath";
  public static final String COBERTURA_MAXMEM_PROPERTY = "sonar.cobertura.maxmem";
  public static final String COBERTURA_MAXMEM_DEFAULT_VALUE = "64m";

  public static final String COBERTURA_GROUP_ID = MavenUtils.GROUP_ID_CODEHAUS_MOJO;
  public static final String COBERTURA_ARTIFACT_ID = "cobertura-maven-plugin";

  private CoberturaConstants() {
  }
}